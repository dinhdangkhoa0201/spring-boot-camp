package com.example.demo.service;

import com.example.demo.entity.OrderDetailEntity;
import com.example.demo.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderDetailService {
    @Autowired
    private OrderDetailRepository orderDetailRepository;
    public OrderDetailEntity saveOrderDetail(OrderDetailEntity id) {
        return orderDetailRepository.save(id);
    }

    public List<OrderDetailEntity> findByOrderId(Integer id) {
        return orderDetailRepository.findByOrderId(id);
    }
}
