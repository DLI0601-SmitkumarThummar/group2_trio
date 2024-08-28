package com.godigit.team2.service.feedback;

import com.godigit.team2.entity.feedback.Feedback;
import com.godigit.team2.repository.feedback.FeedbackRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeebackService {


    FeedbackRepo feedbackRepo;

    @Autowired
    public FeedbackServiceImpl(FeedbackRepo feedbackRepo) {
        this.feedbackRepo = feedbackRepo;
    }


    @Override
    public List<Feedback> getFeedbacksByProductId(int productId) {
        return feedbackRepo.findByProductId(productId);
    }

    @Override
    public void SubmitFeedback(Feedback feedback) {
        feedbackRepo.save(feedback);
    }
}
