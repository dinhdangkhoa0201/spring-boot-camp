package com.example.demo.service;

import com.example.demo.dto.cart.CartDetailDTO;
import com.example.demo.dto.cart.CreateCartRequest;
import com.example.demo.entity.CartEntity;
import com.example.demo.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private CartDetailService cartDetailService;


    public List<CartEntity> findAll() {
        return cartRepository.findAll();
    }

    public CartEntity saveCart(CreateCartRequest request) {
        CartEntity cartEntity = new CartEntity();
        cartEntity.setPhone(request.getPhone());
        cartEntity.setEmail(request.getEmail());
        cartEntity.setTotalAmountOrder(request.getTotalAmountOrder());
        cartRepository.save(cartEntity);

        for (CartDetailDTO dto : request.getListCartDetail()) {
            cartDetailService.save(dto, cartEntity);
        }
        return cartEntity;
    }

    public List<CartEntity> findByEmail(String email) {
        return cartRepository.findByEmail(email);
    }

    public List<CartEntity> findByPhone(String phone) {
        return cartRepository.findByPhone(phone);
    }

}
