package com.pos.demo.controller;

import com.pos.demo.dao.ProductDao;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/products")
@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductDao productDao;

}
