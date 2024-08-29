package com.godigit.team2.controller.cart;

import com.godigit.team2.entity.cart.Cart;
import com.godigit.team2.service.cart.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/digit_e-kart/cart")
public class CartController {


    private CartServiceImpl cartService;

    @Autowired
    public CartController(CartServiceImpl cartService) {
        this.cartService = cartService;
    }

    @GetMapping("/{userId}")
    public ResponseEntity<Cart> getCart(@PathVariable int userId) {
        Cart cart = cartService.getCartByUserId(userId);
        if (cart != null) {
            return ResponseEntity.ok(cart);
        } else {
            return ResponseEntity.notFound().build();
        }
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
