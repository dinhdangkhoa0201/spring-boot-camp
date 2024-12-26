package com.example.demo.dto.cart;

import lombok.Data;

@Data
public class CartDetailDTO {
    private Integer productId;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
}
