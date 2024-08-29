package com.godigit.team2.service.product;

import com.godigit.team2.entity.product.Product;
import com.godigit.team2.repository.product.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImp implements ProductService {

    private ProductRepo productRepository;

    @Autowired
    public ProductServiceImp(ProductRepo productRepository) {
        this.productRepository = productRepository;
    }


    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> searchProducts(String keyword) {
        return productRepository.findByNameContainingOrAuthorContaining(keyword, keyword);
    }

    public Product getProductById(int id) {
        return productRepository.findById(id).orElse(null);
    }
}
