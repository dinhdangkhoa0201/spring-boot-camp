package com.example.demo.service;

import com.example.demo.entity.ProductEntity;
import com.example.demo.proxy.Product;
import com.example.demo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void save(Product product) {
        ProductEntity entity = new ProductEntity();
        entity.setName(product.getName());
        entity.setPrice(product.getPrice());
        this.productRepository.save(entity);
    }

    public ProductEntity findById(Integer id) {
        return this.productRepository.findById(id).get();
    }
}
