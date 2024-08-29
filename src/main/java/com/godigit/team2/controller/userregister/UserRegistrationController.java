package com.godigit.team2.controller.userregister;


import com.godigit.team2.service.user_register.UserRegisterServiceImp;
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


    private UserRegisterServiceImp userRegisterServiceImp;

    @Autowired
    public UserRegistrationController(UserRegisterServiceImp userRegisterServiceImp) {
        this.userRegisterServiceImp = userRegisterServiceImp;
    }


    @PostMapping("/register")
    public String RegisterUser(@RequestBody User user) {
        userRegisterServiceImp.registerUser(user);
        return "Registered Successfully";
    }

    @PostMapping("/login")
    public ResponseEntity<?> LoginUser(@RequestBody User user) {
        User loggedInUser = userRegisterServiceImp.loginUser(user.getUsername(), user.getPassword());
        if (loggedInUser != null) {
            return ResponseEntity.ok(loggedInUser);
        } else {
            return ResponseEntity.status(401).body("Invalid credentials");
        }
    }


}
