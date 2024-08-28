package com.godigit.team2.repository.order;

import com.godigit.team2.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Order, Integer> {
}
