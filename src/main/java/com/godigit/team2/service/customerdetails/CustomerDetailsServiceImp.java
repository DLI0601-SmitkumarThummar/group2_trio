package com.godigit.team2.service.customerdetails;

import com.godigit.team2.dto.CustomerDTO;
import com.godigit.team2.entity.customer_details.CustomerDetails;
import com.godigit.team2.entity.product.Product;
import com.godigit.team2.repository.cutomerdetails.CustomerDetailsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerDetailsServiceImp implements CustomerDetailsService {

    @Autowired
    CustomerDetailsRepo customerDetailsRepo;

    @Autowired
    public CustomerDetailsServiceImp(CustomerDetailsRepo customerDetailsRepo){this.customerDetailsRepo=customerDetailsRepo;}

    @Override
    public void newCustomer(CustomerDTO customer) {
        CustomerDetails customerDetails = new CustomerDetails(customer);
        customerDetailsRepo.save(customerDetails);
    }

    @Override
    public void updateCustomer(CustomerDTO customer, long id) {
        CustomerDetails customerDetails = customerDetailsRepo.findById((int) id).orElseThrow(() -> new RuntimeException("Customer does not exist "));

        customerDetails.setUser(customer.getUser());
        customerDetails.setEmail(customer.getEmail());
        customerDetails.setName(customer.getName());
        customerDetails.setAddress(customer.getAddress());
        customerDetails.setPhone(customer.getPhone());

        customerDetailsRepo.save(customerDetails);
    }
}
