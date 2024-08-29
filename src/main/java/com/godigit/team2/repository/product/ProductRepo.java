package com.godigit.team2.repository.product;

import com.godigit.team2.entity.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    @Query("SELECT p FROM Product p WHERE p.name LIKE %:keyword% OR p.author LIKE %:keyword1%")
    List<Product> findByNameContainingOrAuthorContaining(@Param("keyword") String keyword, @Param("keyword1") String keyword1);
}
