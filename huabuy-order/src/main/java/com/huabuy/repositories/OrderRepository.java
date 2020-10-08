package com.huabuy.repositories;

import com.huabuy.repositories.pojo.OrderPojo;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

@EnableScan
public interface OrderRepository extends CrudRepository<OrderPojo, String> {
    Optional<OrderPojo> findOrderPojoByCustomer(String customerName);
}
