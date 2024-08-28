package com.godigit.team2.repository.admin;

import com.godigit.team2.entity.admin.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepo extends JpaRepository<Admin, Integer> {
}
