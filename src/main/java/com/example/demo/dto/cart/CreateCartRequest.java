package com.example.demo.dto.cart;

import lombok.Data;

@Data


public class CreateCartRequest {



    private String phone;


    private String email;


    private Double totalAmountOrder;
}
