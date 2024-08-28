package com.godigit.team2.controller;

import com.godigit.team2.entity.cart.Cart;
import com.godigit.team2.service.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/digit_e-kart/cart")
public class CartController {

    @Autowired
    private CartServiceImpl cartService;

    @GetMapping("/{userId}")
    public Cart getCart(@PathVariable int userId) {
        Cart cart = cartService.getCartByUserId(userId);
        return cart;
    }

    @PostMapping("/add/{userId}")
    public String addItemToCart(@PathVariable int userId, @RequestParam int productId, @RequestParam int quantity) {
        cartService.addItemToCart(userId, productId, quantity);
        return "Item added to the cart";
    }

    @PutMapping("/update/{cartItemId}")
    public String updateCartItemQuantity(@PathVariable int cartItemId, @RequestParam int quantity) {
        cartService.updateCartItemQuantity(cartItemId, quantity);
        return "Item updated";
    }

    @DeleteMapping("/remove/{cartItemId}")
    public String removeItemFromCart(@PathVariable int cartItemId) {
        cartService.removeItemFromCart(cartItemId);
        return "Item removed from the cart";
    }
}
