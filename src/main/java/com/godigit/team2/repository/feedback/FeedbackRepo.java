package com.godigit.team2.repository.feedback;

import com.godigit.team2.entity.feedback.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepo extends JpaRepository<Feedback, Integer> {
    @Query("SELECT f FROM Feedback f JOIN FETCH f.product p WHERE p.product_id = :productId")
    List<Feedback> findByProductId(int productId);
}
