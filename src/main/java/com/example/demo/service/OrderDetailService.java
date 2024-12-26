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

    public OrderDetailEntity saveOrderDetail(OrderDetailEntity orderDetailEntity) {
        return orderDetailRepository.save(orderDetailEntity);
    }

    public List<OrderDetailEntity> findByOrderDetailId(Integer Id) {
        return orderDetailRepository.findByOrderId(Id);  }
}
