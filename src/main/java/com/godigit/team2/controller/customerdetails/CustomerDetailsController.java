package com.godigit.team2.controller.customerdetails;

import com.godigit.team2.dto.CustomerDTO;
import com.godigit.team2.dto.ProductDTO;
import com.godigit.team2.entity.customer_details.CustomerDetails;
import com.godigit.team2.entity.product.Product;
import com.godigit.team2.service.customerdetails.CustomerDetailsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/digit_e-kart/customerdetails")
public class CustomerDetailsController {

    CustomerDetailsServiceImp customerDetailsServiceImp;

    @Autowired
    public CustomerDetailsController(CustomerDetailsServiceImp customerDetailsServiceImp) {
        this.customerDetailsServiceImp = customerDetailsServiceImp;
    }

    @PostMapping("/add")
    public String addCustomer(@RequestBody CustomerDTO customerDTO){
        customerDetailsServiceImp.newCustomer(customerDTO);
        return "Customer Added";
    }

    @PutMapping("/update/{id}")
        public String updateCustomer(@PathVariable long id, @RequestBody CustomerDTO customerDTO){
        customerDetailsServiceImp.updateCustomer(customerDTO,id);
        return "Customer Updated";
    }
}

