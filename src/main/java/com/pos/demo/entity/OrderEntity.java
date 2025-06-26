package com.pos.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "orders")
@Data
@Entity
public class OrderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_id")
  private Integer orderId;

  @Column(name = "order_total")
  private Integer orderTotal;
}
