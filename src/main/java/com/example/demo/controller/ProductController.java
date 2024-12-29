package com.example.demo.controller;

import com.example.demo.dto.product.CreateProductRequest;
import com.example.demo.entity.ProductEntity;
import com.example.demo.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<Object> saveProduct(@RequestBody CreateProductRequest product) {
        return ResponseEntity.ok(productService.saveProduct(product)) ;
    }

    @GetMapping(path = "/product/{id}")
    public ResponseEntity<Object> findById(@PathVariable("id") Integer id) {
        ProductEntity product = this.productService.findById(id);

        return ResponseEntity.ok(product);
    }

    @GetMapping("/product/find-all")
    public List<ProductEntity> findAll() {
        return productService.findAll();
    }
}
