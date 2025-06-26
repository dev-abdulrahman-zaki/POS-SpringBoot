package com.pos.demo.dao;

import com.pos.demo.entity.ProductEntity;
import com.pos.demo.repository.ProductRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductDao {
  private final ProductRepo productRepo;

  public ProductEntity addProduct(ProductEntity product) {
    return this.productRepo.save(product);
  }

  public ProductEntity updateProduct(ProductEntity product) {
    return this.productRepo.save(product);
  }

  public void deleteProduct(Integer productId) {
    this.productRepo.deleteById(productId);
  }

  public ProductEntity getProductById(Integer productId) {
    ProductEntity product = this.productRepo.findById(productId).orElse(null);
    if (product == null) {
      throw new RuntimeException("Product not found");
    }
    return product;
  }

  public ProductEntity getProductByBarcode(String productBarcode) {
    ProductEntity product = this.productRepo.findByProductBarcode(productBarcode);
    if (product == null) {
      throw new RuntimeException("Product not found");
    }
    return product;
  }

  public Iterable<ProductEntity> getAllProducts() {
    return this.productRepo.findAll();
  }
}
