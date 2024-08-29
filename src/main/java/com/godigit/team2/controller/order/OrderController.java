package com.godigit.team2.controller.order;

import com.godigit.team2.entity.order.Order;
import com.godigit.team2.service.order.OrderServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/digit_e-kart/orders")
public class OrderController {

    @Autowired
    private OrderServiceImp orderService;

    @PostMapping("/add")
    public ResponseEntity<?> placeOrder(@RequestBody Order order) {
        Order placedOrder = orderService.placeOrder(order);
        return ResponseEntity.ok(placedOrder);
    }

    @GetMapping("/history/{userId}")
    public ResponseEntity<List<Order>> getOrderHistory(@PathVariable int userId) {
        List<Order> orders = orderService.getOrderHistory(userId);
        return ResponseEntity.ok(orders);
    }
}
