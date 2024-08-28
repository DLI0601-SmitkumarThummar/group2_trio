package com.godigit.team2.repository.cutomerdetails;

import com.godigit.team2.entity.customer_details.CustomerDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerDetailsRepo extends JpaRepository<CustomerDetails, Integer> {
}
