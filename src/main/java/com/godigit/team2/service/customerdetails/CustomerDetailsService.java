package com.godigit.team2.service.customerdetails;

import com.godigit.team2.dto.CustomerDTO;
import com.godigit.team2.dto.ProductDTO;

public interface CustomerDetailsService {
    public void newCustomer(CustomerDTO customer);
    public void updateCustomer(CustomerDTO customer, long id);
}
