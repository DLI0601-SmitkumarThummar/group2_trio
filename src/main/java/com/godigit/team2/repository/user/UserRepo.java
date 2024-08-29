package com.godigit.team2.repository.user;

import com.godigit.team2.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
<<<<<<< HEAD
=======

>>>>>>> 2d7e7d57508bcc64afbf49674b42587cba06a14a
    User findByUsername(String username);
}
