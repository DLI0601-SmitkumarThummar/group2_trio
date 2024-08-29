package com.godigit.team2.entity.product;

import com.godigit.team2.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="product_details")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;

    @Column(nullable = false)
    private String product_name;

    @Column(columnDefinition = "TEXT")
    private String product_description;

    @Column(nullable = false)
    private int product_price;

    @Column(nullable = false)
    private int product_stock;

    private String product_author;
    private String product_category;

    @Column(nullable = false,updatable = false)
    private LocalDateTime created_at=LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updated_at=LocalDateTime.now();


    public Product(ProductDTO productDTO) {
        this.product_name = productDTO.getProduct_name();
        this.product_description = productDTO.getProduct_description();
        this.product_price = productDTO.getProduct_price();
        this.product_stock = productDTO.getProduct_stock();
        this.product_author = productDTO.getProduct_author();
        this.product_category = productDTO.getProduct_category();

    }
}
