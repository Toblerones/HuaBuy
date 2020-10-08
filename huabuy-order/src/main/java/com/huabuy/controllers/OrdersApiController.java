package com.huabuy.controllers;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.huabuy.models.OrderInfo;
import com.huabuy.repositories.OrderRepository;
import com.huabuy.repositories.pojo.OrderPojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-06T22:01:07.491+10:00[Australia/Sydney]")

@Controller
@RequestMapping("${openapi.huabuyOrder.base-path:/huabuy}")
public class OrdersApiController implements OrdersApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrdersApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Autowired
    private OrderRepository orderRepository;

    public ResponseEntity<List<OrderInfo>> ordersGet() {

        List<OrderPojo> list = (List<OrderPojo>) orderRepository.findAll();
        for(OrderPojo pojo : list){
            System.out.println(pojo.getCustomer());
        }
        return null;
    }
}
