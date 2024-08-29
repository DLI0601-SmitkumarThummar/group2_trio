package com.godigit.team2.controller.admin;

import com.godigit.team2.dto.LoginDTO;
import com.godigit.team2.entity.admin.Admin;
import com.godigit.team2.service.admin.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/digit_e-kart/admin")
public class AdminController {


    AdminServiceImpl adminServiceImpl;

    @Autowired
    public AdminController(AdminServiceImpl adminServiceImpl) {
        this.adminServiceImpl = adminServiceImpl;
    }

    @PostMapping("/login")
    public String adminlogin(@RequestBody LoginDTO loginDetails) {
        String username = loginDetails.getUsername();
        String password = loginDetails.getPassword();

        if (adminServiceImpl.checkAdmin(username, password)) {
            return "Admin Logined";
        } else {
            throw new RuntimeException("Invalid Credentials");
        }
    }

    @PostMapping("/register")
    public String adminregister(@RequestBody Admin admin) {
        adminServiceImpl.addAdmin(admin);
        return "Admin Added";
    }
} 
