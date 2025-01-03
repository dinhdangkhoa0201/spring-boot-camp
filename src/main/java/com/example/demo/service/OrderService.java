package com.example.demo.service;

import com.example.demo.entity.OrderEntity;
import com.example.demo.repository.OrderRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public OrderEntity saveOrder(OrderEntity order) {
        return orderRepository.save(order);
    }

    public List<OrderEntity> findAll() {
        return orderRepository.findAll();
    }

    public List<OrderEntity> findByPhone(String phone) {
        return orderRepository.findByPhone(phone);
    }

    public List<OrderEntity> findByEmail(String email) {
        return orderRepository.findByEmail(email);
    }
}
