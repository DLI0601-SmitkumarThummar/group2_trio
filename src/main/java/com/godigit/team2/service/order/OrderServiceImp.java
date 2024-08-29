package com.godigit.team2.service.order;

import com.godigit.team2.entity.order.Order;
import com.godigit.team2.repository.order.OrderItemRepo;
import com.godigit.team2.repository.order.OrderRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService{
    @Autowired
    private OrderRepo orderRepository;

    @Autowired
    private OrderItemRepo orderItemRepository;

    public Order placeOrder(Order order) {

        return orderRepository.save(order);
    }

    public List<Order> getOrderHistory(int userId) {

        return orderRepository.findByUserId(userId);
    }
}
