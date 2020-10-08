package com.huabuy.controllers;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.huabuy.models.ItemInfo;
import com.huabuy.models.OrderInfo;
import com.huabuy.repositories.OrderRepository;
import com.huabuy.repositories.pojo.ItemPojo;
import com.huabuy.repositories.pojo.OrderPojo;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-08-06T22:01:07.491+10:00[Australia/Sydney]")

@Controller
@RequestMapping("${openapi.huabuyOrder.base-path:/huabuy}")
public class OrderApiController implements OrderApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public OrderApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Autowired
    private OrderRepository orderRepository;

    public ResponseEntity<Void> orderPost(@ApiParam(value = "create order", required = true) @Valid @RequestBody OrderInfo orderInfo) {

        OrderPojo orderPojo = new OrderPojo();

        List<ItemPojo> orderItems = new LinkedList<>();
        for ( ItemInfo itemInfo : orderInfo.getOrderItems()){
            ItemPojo value = new ItemPojo();
            value.setItem(itemInfo.getItem());
            value.setOriginalPrice(itemInfo.getOriginalPrice());
            value.setId((new Random().nextInt()));
            orderItems.add(value);
        }

        orderPojo.setCustomer(orderInfo.getCustomer());
        orderPojo.setDate(orderInfo.getDate());
        orderPojo.setOrderItems(orderItems);
        orderPojo.setTotalPrice("100");
        orderRepository.save(orderPojo);
        return null;
    }

}
