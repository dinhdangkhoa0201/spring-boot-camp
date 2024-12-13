package com.example.demo.controller;

import com.example.demo.entity.CartDetailEntity;
import com.example.demo.entity.CartEntity;
import com.example.demo.service.CartService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping(value = "/save")
    public CartEntity save(@RequestBody CartEntity cartEntity) {
        return cartService.saveCart(cartEntity);
    }

    @GetMapping(value = "/find-all")
    public List<CartEntity> findAll() {
        return cartService.findAll();
    }

    @PostMapping("/update/{id}")
    public CartEntity update(@PathVariable("id") Integer cartId, @RequestBody CartDetailEntity cartDetailEntity) {
        return cartService.update(cartId, cartDetailEntity);
    }

    @GetMapping("/{id}")
    public CartEntity findById(@PathVariable("id") Integer cartId) {
        return cartService.findById(cartId);
    }
}
