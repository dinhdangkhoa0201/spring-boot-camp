package com.example.demo.controller;

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

}

