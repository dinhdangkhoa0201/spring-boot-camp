package com.example.demo.service;

import com.example.demo.dto.cart.CartDetailDTO;
import com.example.demo.entity.CartDetailEntity;
import com.example.demo.entity.CartEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repository.CartDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartDetailService {
    @Autowired
    private CartDetailRepository cartDetailRepository;
    @Autowired
    private ProductService productService;

    public CartDetailEntity save(CartDetailDTO cartDetail, CartEntity cartEntity) {
        CartDetailEntity cartDetailEntity = new CartDetailEntity();
        ProductEntity productEntity = productService.findById(cartDetail.getProductId());
        cartDetailEntity.setProduct(productEntity);
        cartDetailEntity.setQuantity(cartDetail.getQuantity());
        cartDetailEntity.setUnitPrice(cartDetail.getUnitPrice());
        cartDetailEntity.setTotalAmount(cartDetail.getTotalAmount());
        cartDetailEntity.setCart(cartEntity);
        return cartDetailRepository.save(cartDetailEntity);
    }

    public List<CartDetailEntity> findByCartId(Integer cartId) {
        return cartDetailRepository.findByCartId(cartId);
    }
}
