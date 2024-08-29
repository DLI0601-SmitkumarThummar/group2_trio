package com.godigit.team2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private String product_name;
    private String product_description;
    private int product_price;
    private int product_stock;
    private String product_author;
    private String product_category;
}