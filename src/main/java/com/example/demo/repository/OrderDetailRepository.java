package com.example.demo.repository;

import com.example.demo.entity.OrderDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetailEntity, Integer> {
     List<OrderDetailEntity> findByOrderId(Integer orderId);
}
