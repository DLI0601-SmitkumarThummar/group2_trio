package com.godigit.team2.service.adminproduct;


import com.godigit.team2.dto.ProductDTO;
import com.godigit.team2.entity.product.Product;
import com.godigit.team2.repository.product.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminProductServiceImpl implements AdminProductService { 


    ProductRepo productRepo;

    @Autowired
    public AdminProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    @Override
    public void newProduct(ProductDTO productDTO) {
        
        Product product = new Product(productDTO);
        productRepo.save(product);
    }

    @Override
    public void updateProduct(ProductDTO pro, int id) {
        Product product = productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product does not exist "));

        product.setProduct_name(pro.getProduct_name());
        product.setProduct_description(pro.getProduct_description());
        product.setProduct_price(pro.getProduct_price());
        product.setProduct_stock(pro.getProduct_stock());
        product.setProduct_author(pro.getProduct_author());
        product.setProduct_category(pro.getProduct_category());

        productRepo.save(product);

    }

    @Override
    public Boolean removeProducts(int id) {

        if (productRepo.existsById(id)) {
            productRepo.deleteById(id);
            return true;
        }

        return false;
    }


}
