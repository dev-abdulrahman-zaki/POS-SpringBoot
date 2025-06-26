package com.pos.demo.controller;

import com.pos.demo.dao.ProductDao;
import com.pos.demo.entity.ProductEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/products")
@RestController
@RequiredArgsConstructor
public class ProductController {

  private final ProductDao productDao;

  @PostMapping("add-product")
  public ProductEntity addProduct(@RequestBody ProductEntity product) {
    return this.productDao.addProduct(product);
  }

  @PostMapping("update-product")
  public ProductEntity updateProduct(@RequestBody ProductEntity product) {
    return this.productDao.updateProduct(product);
  }

  @DeleteMapping("delete-product")
  public String deleteProduct(@RequestParam Integer productId) {
    this.productDao.deleteProduct(productId);
    return "success";
  }

  @GetMapping("get-product-by-id")
  public ProductEntity getProductById(@RequestParam Integer productId) {
    return this.productDao.getProductById(productId);
  }

  @GetMapping("get-product-by-barcode")
  public ProductEntity getProductByBarcode(@RequestParam String productBarcode) {
    return this.productDao.getProductByBarcode(productBarcode);
  }

  @GetMapping("get-all-products")
  public Iterable<ProductEntity> getAllProducts() {
    return this.productDao.getAllProducts();
  }
}
