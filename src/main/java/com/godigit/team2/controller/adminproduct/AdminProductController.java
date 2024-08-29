package com.godigit.team2.controller.adminproduct;


import com.godigit.team2.dto.ProductDTO;

import com.godigit.team2.service.adminproduct.AdminProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/digit_e-kart/adminproduct")
public class AdminProductController {

    AdminProductServiceImpl adminProductServiceImpl;

    @Autowired
    public AdminProductController(AdminProductServiceImpl adminProductServiceImpl) {
        this.adminProductServiceImpl = adminProductServiceImpl;
    }

    @PostMapping("/add")
    public String addProduct(@RequestBody ProductDTO product){
        adminProductServiceImpl.newProduct(product);
        return "Product Added";
    }

    @PutMapping("/update/{id}")
    public String updateP(@PathVariable int id,@RequestBody ProductDTO productDTO){
        adminProductServiceImpl.updateProduct(productDTO,id);
        return "Product Updated";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteP(@PathVariable int id){
        if(adminProductServiceImpl.removeProducts(id)){
            return "Product Deleted";
        }
        else{
            return "Product Don't Exist";
        }
    }
}
