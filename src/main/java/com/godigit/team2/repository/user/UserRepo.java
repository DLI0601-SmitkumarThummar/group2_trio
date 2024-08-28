package com.godigit.team2.repository.user;

import com.godigit.team2.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
}
