package com.example.demo.controller;


import com.example.demo.proxy.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(path = "/product")
    public ResponseEntity<Object> save(@RequestBody Product product) {
        this.productService.save(product);

        return ResponseEntity.ok("Save product sucessfully!");
    }
}
