package com.godigit.team2.service.order;

import com.godigit.team2.entity.order.Order;

import java.util.List;

public interface OrderService {

    public Order placeOrder(Order order);
    public List<Order> getOrderHistory(int userId);

}
