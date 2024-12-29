package com.example.demo.service;

import com.example.demo.dto.product.CreateProductRequest;
import com.example.demo.entity.ProductEntity;
import com.example.demo.proxy.Product;
import com.example.demo.proxy.Product;
import com.example.demo.repository.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductEntity> findAll() {
        return this.productRepository.findAll();
    }

    public ProductEntity saveProduct(CreateProductRequest request) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName(request.getName());
        productEntity.setPrice(request.getPrice());

        return productRepository.save(productEntity);
    }

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
