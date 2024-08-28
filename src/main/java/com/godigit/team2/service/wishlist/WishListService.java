package com.godigit.team2.service.wishlist;

import com.godigit.team2.entity.product.Product;
import com.godigit.team2.entity.wishlist.WishList;

public interface WishListService {

    public void removefromWishList(int wishListId);
    public void addtoWishList(int userId,int product_id);
    public WishList getWishList(int userId);

}
