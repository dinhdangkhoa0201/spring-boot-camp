package com.example.demo.service;

import com.example.demo.entity.CatalogyEntity;
import com.example.demo.repository.CatalogyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogyService {
    @Autowired
    private CatalogyRepository catalogyRepository;
    public void saveCatalogy(CatalogyEntity catalogyEntity) {
        catalogyRepository.save(catalogyEntity);
    };
    public void findByIdCatalogy(Integer id) {catalogyRepository.findById(id).orElse(null);};
}
