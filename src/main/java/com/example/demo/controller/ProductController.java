package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @PostMapping("/product")
    public ResponseEntity<Object> saveProduct(@RequestBody ProductEntity product) {
        productService.saveProduct(product);
        return ResponseEntity.ok("luu thanh cong");
    }
}

