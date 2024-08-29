package com.godigit.team2.service.product;

import com.godigit.team2.entity.product.Product;
import java.util.List;

public interface ProductService {

    public List<Product> getAllProducts();
    public List<Product> searchProducts(String keyword);
    public Product getProductById(int id);

}
