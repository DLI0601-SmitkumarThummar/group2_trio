package com.godigit.team2.service.register;

import com.godigit.team2.entity.user.User;
import com.godigit.team2.repository.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImp implements RegisterService {

    @Autowired
    private UserRepo userRepository;

//    @Autowired
//    private PasswordEncoder passwordEncoder;
    @Override
    public User registerUser(User user) {
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }


    @Override
    public User loginUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && password.equals(user.getPassword())) {
            return user;
        }
        return null;
    }
}