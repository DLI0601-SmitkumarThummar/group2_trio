package com.godigit.team2.service.register;

import com.godigit.team2.entity.user.User;

public interface RegisterService {
    public User registerUser(User user);
    public User loginUser(String username, String password);
}
