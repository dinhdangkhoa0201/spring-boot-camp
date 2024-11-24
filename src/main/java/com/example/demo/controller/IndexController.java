package com.example.demo.controller;

import com.example.demo.entity.ProductEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @GetMapping("/")
    public ResponseEntity<Object> indexController() {
        return ResponseEntity.ok("Hello World");
    }
    @GetMapping("/healthcheck")
    public ResponseEntity<Object> healthcheck() {
        return ResponseEntity.ok("Hello World 1");
    }

    // GET: lay thong tin cua san pham, lay thong tin cua danh sach san pham

    // POST: dang nhap, dang ky, doi mat khau. thuong danh cho thong tin bao mat

    @GetMapping(path = "/index")
    public ResponseEntity<Object> index() {
        return ResponseEntity.ok("Welcome to Spring Boot!");
    }

    @GetMapping(path = "/index2")
    public ResponseEntity<Object> index2() {
        return ResponseEntity.ok("Welcome to Spring Boot 2!");
    }
}
