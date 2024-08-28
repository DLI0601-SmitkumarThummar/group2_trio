package com.godigit.team2.repository.wishlist;

import com.godigit.team2.entity.wishlist.WishListItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListItemRepo extends JpaRepository<WishListItem, Integer> {
}
