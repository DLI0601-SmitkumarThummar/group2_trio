package com.godigit.team2.repository.feedback;

import com.godigit.team2.entity.feedback.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeebackRepo extends JpaRepository<Feedback, Integer> {
}
