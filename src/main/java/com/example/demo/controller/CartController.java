package com.example.demo.controller;

import com.example.demo.dto.cart.CreateCartRequest;
import com.example.demo.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {
    @Autowired
    private CartService cartService;
    @PostMapping("/cart")
    public ResponseEntity<Object> saveCart(@RequestBody CreateCartRequest createCartRequest) {
        return ResponseEntity.ok(cartService.saveCart(createCartRequest));
    }
}

