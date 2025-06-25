package com.pos.demo.entity;
import jakarta.persistence.*;
import lombok.Data;

@Table(name = "products")
@Data
@Entity
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Double productPrice;

    @Column(name="product_barcode")
    private String productBarcode;
}
