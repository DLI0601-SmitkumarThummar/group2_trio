package com.godigit.team2.controller.wishlist;

import com.godigit.team2.entity.wishlist.WishList;
import com.godigit.team2.service.wishlist.WishListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/digit_e-kart/wishlist")
public class WishListController {

    WishListServiceImpl wishListService;

    @Autowired
    public WishListController(WishListServiceImpl wishListService) {
        this.wishListService = wishListService;
    }

    @GetMapping("/{user_id}")
    public WishList getWishList(@PathVariable int user_id) {
        return wishListService.getWishList(user_id);
    }

    @PostMapping("/add/{user_id}")
    public String addWishList(@PathVariable int user_id,@RequestParam int product_id) {
        wishListService.addtoWishList(user_id,product_id);
        return "Item added to WishList";
    }

    @DeleteMapping("/remove/{user_id}")
    public String removeWishList(@PathVariable int user_id,@RequestParam int wishlistitem_id) {
        wishListService.removefromWishList(wishlistitem_id);
        return "Item removed from WishList";
    }
}
