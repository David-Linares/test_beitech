package com.beitech.test.BeitechTest.util;

import org.springframework.http.HttpStatus;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

public class ResponseFormat {

    public ResponseFormat() {
    }

    public Map<String, Object> createOrderResponse(){
        Map<String, Object> response = new HashMap<>();
        response.put("msg", "Se ha creado la orden correctamente!!");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        response.put("timestamp", timestamp);
        response.put("status",HttpStatus.OK);
        return response;
    }

    public Map<String, Object> errorCreateOrder(String error){
        Map<String, Object> response = new HashMap<>();
        response.put("status",HttpStatus.INTERNAL_SERVER_ERROR);
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        response.put("timestamp", timestamp);
        response.put("msg", "Se produjo un error creando la orden, por favor inténtelo nuevamente");
        response.put("detail", error);
        return response;
    }

}
