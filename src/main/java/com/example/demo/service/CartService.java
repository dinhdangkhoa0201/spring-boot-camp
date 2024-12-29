package com.example.demo.service;

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

    public CartEntity saveCart(CreateCartRequest createCartRequest) {
      CartEntity cartEntity = new CartEntity();
      cartEntity.setEmail(createCartRequest.getEmail());
      cartEntity.setPhone(createCartRequest.getPhone());
      cartEntity.setTotalAmountOrder(createCartRequest.getTotalAmountOrder());
      cartRepository.save(cartEntity);

      return cartEntity;
    }


    public List<CartEntity> findByEmail(String email) {
        return cartRepository.findByEmail(email);
    }

    public List<CartEntity> findByPhone(String phone) {
        return cartRepository.findByPhone(phone);
    }

}
