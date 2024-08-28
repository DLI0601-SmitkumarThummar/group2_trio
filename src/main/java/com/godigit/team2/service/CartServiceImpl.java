package com.godigit.team2.service;

import com.godigit.team2.entity.cart.Cart;
import com.godigit.team2.entity.cart.CartItem;
import com.godigit.team2.entity.product.Product;
import com.godigit.team2.repository.cart.CartItemRepo;
import com.godigit.team2.repository.cart.CartRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.Optional;

@Service
public class CartServiceImpl {

    @Autowired
    private CartRepo cartRepo;

    @Autowired
    private CartItemRepo cartItemRepo;

    public Cart getCartByUserId(int userId) {
        Cart cart = cartRepo.findByUserId(userId);
        return cart;
    }

    @Transactional
    public void addItemToCart(int userId, int productId, int quantity) {
        Cart cart = cartRepo.findByUserId(userId);
        if (cart == null) {
            cart = new Cart();
            cart.setUserId(userId);
            cart.setCreatedAt(LocalDateTime.now());
            cart = cartRepo.save(cart);
        }

        Product product=new Product();
        //Product product = productRepo.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));

        CartItem cartItem = new CartItem();
        cartItem.setCart(cart);
        cartItem.setProduct(product); // Set the Product entity instead of productId
        cartItem.setQuantity(quantity);
        cart.getItems().add(cartItem);

        cartRepo.save(cart);
    }


    @Transactional
    public void updateCartItemQuantity(int cartItemId, int quantity) {
        Optional<CartItem> cartItemOpt = cartItemRepo.findById(cartItemId);
        if (cartItemOpt.isPresent()) {
            CartItem cartItem = cartItemOpt.get();
            cartItem.setQuantity(quantity);
            cartItemRepo.save(cartItem);

        }
    }

    @Transactional
    public void removeItemFromCart(int cartItemId) {
        Optional<CartItem> cartItemOpt = cartItemRepo.findById(cartItemId);
        if (cartItemOpt.isPresent()) {
            CartItem cartItem = cartItemOpt.get();
            Cart cart = cartItem.getCart();
            cart.getItems().remove(cartItem);
            cartItemRepo.delete(cartItem);

        }

    }
}
