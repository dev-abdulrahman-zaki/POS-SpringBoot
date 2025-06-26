package com.pos.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "sales")
@Data
@Entity
public class SaleEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "sale_id")
  private Integer saleId;

  @Column(name = "product_id")
  private Integer productId;

  @Column(name = "order_id")
  private Integer orderId;

  //    @Column(name = "sale_createdAt")
  //    private Double saleCreatedAt;
}
