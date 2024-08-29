package com.godigit.team2.service.adminproduct;

import com.godigit.team2.dto.ProductDTO;

public interface AdminProductService {
    public void newProduct(ProductDTO productDTO);
    public void updateProduct(ProductDTO pro, int id);
    public Boolean removeProducts(int id);
}
