package com.pos.demo.controller;

import com.pos.demo.dao.ProductDao;
import com.pos.demo.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/products")
@RestController
@RequiredArgsConstructor
public class ProductController {

  private final ProductDao productDao;

  @PostMapping("add-product")
  public ProductEntity addProduct(@RequestBody ProductEntity product) {
    return this.productDao.addProduct(product);
  }
}
