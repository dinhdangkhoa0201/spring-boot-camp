package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "catalogy")
public class CatalogyEntity {
    @Id
    private Integer id;
    private String name;
    private String description;
    private String createdBy;
}
