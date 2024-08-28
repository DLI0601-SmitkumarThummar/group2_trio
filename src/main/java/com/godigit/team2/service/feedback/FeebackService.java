package com.godigit.team2.service.feedback;

import com.godigit.team2.entity.feedback.Feedback;

import java.util.List;

public interface FeebackService {
    public List<Feedback> getFeedbacksByProductId(int productId);
    public void SubmitFeedback(Feedback feedback);
}
