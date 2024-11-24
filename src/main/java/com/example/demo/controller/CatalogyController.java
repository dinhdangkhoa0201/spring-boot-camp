package com.example.demo.controller;

import com.example.demo.entity.CatalogyEntity;
import com.example.demo.service.CatalogyService;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatalogyController {
    @Autowired
    private CatalogyService catalogyService;

    @PostMapping("/catalogy")
    public ResponseEntity<Object> saveCatalogy(@RequestBody CatalogyEntity catalogy) {
        catalogyService.saveCatalogy(catalogy);
        return ResponseEntity.ok("Catalogy Saved");
    }
}
