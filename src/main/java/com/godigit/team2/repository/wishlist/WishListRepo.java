package com.godigit.team2.repository.wishlist;

import com.godigit.team2.entity.wishlist.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepo extends JpaRepository<WishList, Integer> {
    WishList findByUserId(int userId);
}
