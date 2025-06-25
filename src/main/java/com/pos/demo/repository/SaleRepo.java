package com.pos.demo.repository;

import com.pos.demo.entity.SaleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepo extends JpaRepository<SaleEntity, Integer> {
    
}
