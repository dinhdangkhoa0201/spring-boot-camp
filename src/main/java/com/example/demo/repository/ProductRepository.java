package com.example.demo.repository;

import com.example.demo.entity.ProductEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer> {

    // =: so sanh tuyet doi
    List<ProductEntity> findByName(String name);

    // LIKE: so sanh tuong doi
    List<ProductEntity> findByNameLike(String name);

    // Ignore case: khong phan biet hoa thuong
    List<ProductEntity> findByNameIgnoreCase(String name);

    // Greater: lon hon
    List<ProductEntity> findByPriceLessThan(Double price);

    // Less: nho hon
    List<ProductEntity> findByPriceGreaterThan(Double price);

    // name and prices > ..
    List<ProductEntity> findByNameAndPriceGreaterThan(String name, Double price);
}
