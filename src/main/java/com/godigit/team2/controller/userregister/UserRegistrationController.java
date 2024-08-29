package com.godigit.team2.controller.userregister;

import com.godigit.team2.service.register.RegisterServiceImp;
import com.godigit.team2.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/digit_e-kart/user_registration")
public class UserRegistrationController {

    @Autowired
    private RegisterServiceImp userService;

    @PostMapping("/register")
    public String RegisterUser(@RequestBody User user) {
         userService.registerUser(user);
        return "Registered Successfully";
    }

    @PostMapping("/login")
    public ResponseEntity<?> LoginUser(@RequestBody User user) {
        User loggedInUser = (User) userService.loginUser(user.getUsername(), user.getPassword());
        if (loggedInUser != null) {
            return ResponseEntity.ok(loggedInUser);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }


}
