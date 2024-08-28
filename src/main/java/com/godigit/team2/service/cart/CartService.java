package com.godigit.team2.service.cart;

import com.godigit.team2.entity.cart.Cart;
import org.springframework.transaction.annotation.Transactional;

public interface CartService {
    public Cart getCartByUserId(int userId);
    public void addItemToCart(int userId, int productId, int quantity);
    public void updateCartItemQuantity(int cartItemId, int quantity);
    public void removeItemFromCart(int cartItemId);

}
