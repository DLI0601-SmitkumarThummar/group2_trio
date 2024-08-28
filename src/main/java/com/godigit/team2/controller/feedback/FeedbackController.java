package com.godigit.team2.controller.feedback;

import com.godigit.team2.entity.feedback.Feedback;
import com.godigit.team2.service.feedback.FeedbackServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/digit_e-kart/feedback")
public class FeedbackController {


    FeedbackServiceImpl feedbackService;

    @Autowired
    public FeedbackController(FeedbackServiceImpl feedbackService) {
        this.feedbackService = feedbackService;
    }

    @GetMapping("/{product_id}")
    public List<Feedback> getFeedback(@PathVariable int product_id) {
        return feedbackService.getFeedbacksByProductId(product_id);
    }

    @PostMapping("/submit")
    public String submitFeedback(@RequestBody Feedback feedback) {
        feedbackService.SubmitFeedback(feedback);
        return "Feedback submitted";
    }


}
