package com.example.demo.dto.product;

import lombok.Data;

@Data
public class CreateProductRequest {
    private String name;

    private Double price;
}
