package com.godigit.team2.repository.wishlist;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishList extends JpaRepository<WishList, Integer> {
}
