package com.godigit.team2.repository.feedback;

import com.godigit.team2.entity.feedback.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeebackRepo extends JpaRepository<Feedback, Integer> {
}
