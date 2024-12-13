package com.example.demo.service;

import com.example.demo.entity.CartEntity;
import com.example.demo.entity.OrderEntity;
import com.example.demo.repository.CartRepository;
import com.example.demo.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;
    public List<OrderEntity> findAll(){
        return this.orderRepository.findAll();
    }
    public OrderEntity save(OrderEntity orderEntity){
        return orderRepository.save(orderEntity);
    }
    public List<OrderEntity> findByEmail(String email){
        return orderRepository.findByEmail(email);
    }
    public List<OrderEntity> findByPhone(String phone){
        return orderRepository.findByPhone(phone);
    }

}
