package com.example.demo.dto.cart;

import com.example.demo.dto.product.ProductDTO;
import lombok.Data;

import java.util.List;

@Data
public class CreateCartRequest {
    private String phone;

    private String email;

    private Double totalAmountOrder;

    private List<CartDetailDTO> listCartDetail;

}
