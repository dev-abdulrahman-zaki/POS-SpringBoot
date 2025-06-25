package com.pos.demo.dao;

import com.pos.demo.repository.SaleRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SaleDao {
    private final SaleRepo saleRepo;
    
}
