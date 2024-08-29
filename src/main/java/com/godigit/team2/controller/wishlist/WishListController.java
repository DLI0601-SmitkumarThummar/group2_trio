package com.godigit.team2.controller.wishlist;

import com.godigit.team2.entity.wishlist.WishList;
import com.godigit.team2.service.wishlist.WishListServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<WishList> getWishList(@PathVariable int user_id) {
        WishList wishList = wishListService.getWishList(user_id);
        if (wishList != null) {
            return ResponseEntity.ok(wishList); // Return 200 OK with the wishlist
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null); // Return 404 Not Found if wishlist is not found
        }
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
