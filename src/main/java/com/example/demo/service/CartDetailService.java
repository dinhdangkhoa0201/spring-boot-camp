package com.example.demo.service;

import com.example.demo.entity.CartDetailEntity;
import com.example.demo.repository.CartDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDetailService {
    @Autowired
    private CartDetailRepository cartDetailRepository;
    public CartDetailEntity save(CartDetailEntity cartDetailEntity) {
        return cartDetailRepository.save(cartDetailEntity);
    }
    public List<CartDetailEntity> findByCartId(Integer cartId) {
        return cartDetailRepository.findByCartId(cartId);
    }
}
