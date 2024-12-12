package com.example.demo.service;

import com.example.demo.entity.CartEntity;
import com.example.demo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// CRUD
// C: create => save
// R: read => findAll, findById, findBy...
// U: update => update ... ById
// D: delete => delete... ById
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public List<CartEntity> findByEmail(String email) {
        return cartRepository.findByEmail(email);
    }

    public List<CartEntity> findByPhone(String phone) {
        return cartRepository.findByPhone(phone);
    }
    public CartEntity saveCart(CartEntity cart) {
        return cartRepository.save(cart);
    }
    public List<CartEntity> findAll() {
        return cartRepository.findAll();
    }

}
