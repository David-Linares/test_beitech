package com.beitech.test.BeitechTest.controller;


import com.beitech.test.BeitechTest.services.CustomerService;
import com.beitech.test.BeitechTest.services.OrderDetailService;
import com.beitech.test.BeitechTest.services.OrderService;
import com.beitech.test.BeitechTest.entities.Customer;
import com.beitech.test.BeitechTest.entities.Order;
import com.beitech.test.BeitechTest.entities.OrderDetail;
import com.beitech.test.BeitechTest.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:9000")
@RestController
@RequestMapping("/orders")
public class OrderController {

    private OrderService orderService;
    private CustomerService customerService;
    private OrderDetailService orderDetailService;
    private Util util;

    @Autowired
    public OrderController(OrderService orderService, CustomerService customerService, OrderDetailService orderDetailService) {
        this.orderService = orderService;
        this.customerService = customerService;
        this.orderDetailService = orderDetailService;
        this.util = new Util();
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Order> findAllOrders(){
        return orderService.getAllOrders();
    }

    @RequestMapping("/customer/{customerId}")
    public List<Order> findOrdersByCustomer(@PathVariable int customerId, @RequestParam(value = "initial_date", required=true) String initialDateParam, @RequestParam(value = "finish_date", required = true) String finishDateParam){
        initialDateParam += " 00:00:00";
        finishDateParam += " 23:59:59";
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date initialDate = null;
        Date finishDate = null;
        try {
            initialDate = formatter.parse(initialDateParam);
            finishDate = formatter.parse(finishDateParam);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return orderService.getOrdersByCustomerId(initialDate, finishDate, customerId);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity createOrder(@RequestBody Map<String, Object> orderObj, HttpServletResponse responseServlet){
        Map<String, Object> response;
        try {
            ArrayList<Map<String, String>> detailOrder = (ArrayList<Map<String, String>>) orderObj.get("detail");
            if (detailOrder.size() > 5){
                throw new Exception("No es permitido añadir más de 5 productos en una orden.");
            }
            // Create new Order
            System.out.println("Creando Orden...");
            Customer customerInfo = customerService.getCustomerInfo(Integer.parseInt((String) orderObj.get("id_customer")));
            Order orderCreate = orderService.createNewOrder(new Order(customerInfo, (String) orderObj.get("delivery_address")));
            for (Map<String, String> orderDetail : detailOrder) {
                System.out.println("Creando Orden Detail...");
                OrderDetail newOrderDetail = new OrderDetail(orderCreate, orderDetail.get("product_description"), Double.parseDouble(orderDetail.get("price")));
                orderDetailService.createNewOrderDetail(newOrderDetail);
            }
            response = util.createOrderResponse();
        }catch (Exception e){
            System.out.println("Se ha producido un error...");
            e.printStackTrace();
            response = util.errorCreateOrder(e.getMessage());
        }
        return new ResponseEntity(response, (HttpStatus) response.get("status"));
    }

}
