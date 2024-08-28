package com.godigit.team2.entity.wishlist;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.godigit.team2.entity.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "wishlist_item_table")
public class WishListItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int wishlist_item_id;

    @ManyToOne
    @JoinColumn(name = "wishlist_id")
    @JsonBackReference
    private WishList wishlist;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
