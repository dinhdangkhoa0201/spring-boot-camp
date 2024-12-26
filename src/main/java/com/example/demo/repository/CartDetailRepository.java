package com.example.demo.repository;

import com.example.demo.entity.CartDetailEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartDetailRepository extends JpaRepository<CartDetailEntity, Integer> {
    List<CartDetailEntity> findByCartId(Integer id);
}
