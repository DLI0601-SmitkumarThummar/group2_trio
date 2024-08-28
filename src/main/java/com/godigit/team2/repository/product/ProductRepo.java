package com.godigit.team2.repository.product;

import com.godigit.team2.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Integer> {
}
