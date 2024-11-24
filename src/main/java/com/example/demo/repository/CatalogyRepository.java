package com.example.demo.repository;

import com.example.demo.entity.CatalogyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface   CatalogyRepository extends JpaRepository<CatalogyEntity, Integer> {
}
