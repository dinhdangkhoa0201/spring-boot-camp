package com.example.demo.service;

import com.example.demo.entity.CartDetailEntity;
import com.example.demo.entity.CartEntity;
import com.example.demo.repository.CartDetailRepository;
import com.example.demo.repository.CartRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
// CRUD
// C: create => save
// R: read => findAll, findById, findBy...
// U: update => update ... ById
// D: delete => delete... ById
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private CartDetailRepository cartDetailRepository;

    public List<CartEntity> findByEmail(String email) {
        return cartRepository.findByEmail(email);
    }

    public List<CartEntity> findByPhone(String phone) {
        return cartRepository.findByPhone(phone);
    }

    public CartEntity saveCart(CartEntity cart) {
        List<CartDetailEntity> listCartDetail = cart.getListCartDetail();
        cart.setListCartDetail(null);

        cart = cartRepository.save(cart);

        for (CartDetailEntity cartDetail : listCartDetail) {
            CartEntity cartEntity = new CartEntity();
            cartEntity.setId(cart.getId());
            cartDetail.setCart(cartEntity);
        }

        listCartDetail = cartDetailRepository.saveAll(listCartDetail);

        cart.setListCartDetail(listCartDetail);

        return cart;
    }

    public List<CartEntity> findAll() {
        return cartRepository.findAll();
    }

    public CartEntity findById(Integer cartId) {
        CartEntity cartEntity = cartRepository.findById(cartId).get();

        List<CartDetailEntity> listCartDetail = cartDetailRepository.findByCartId(cartId);

        cartEntity.setListCartDetail(listCartDetail);
        return cartEntity;
    }

    public CartEntity update(Integer cartId, CartDetailEntity cartDetailEntity) {
        Optional<CartEntity> option = cartRepository.findById(cartId);
        if (option.isEmpty()) {
            return null;
        }
        CartEntity cartEntity = option.get();

        // Decrease: so tien cu - so tien them vao = so tien moi
        // Increase: so tien cu + so tien them vao = so tien moi
        cartEntity.setTotalAmountOrder(
                cartEntity.getTotalAmountOrder().add(cartDetailEntity.getTotalAmount())
        );

        cartDetailEntity.setCart(cartEntity);
        cartDetailRepository.save(cartDetailEntity);


        return cartRepository.findById(cartId).get();
    }

}
