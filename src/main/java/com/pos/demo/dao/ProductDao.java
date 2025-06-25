package com.pos.demo.dao;

import com.pos.demo.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDao {
    private final ProductRepo productRepo;
}
