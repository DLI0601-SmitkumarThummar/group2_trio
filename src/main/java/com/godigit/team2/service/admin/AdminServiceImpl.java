package com.godigit.team2.service.admin;

import com.godigit.team2.entity.admin.Admin;
import com.godigit.team2.repository.admin.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {


    AdminRepo adminRepo;

    @Autowired
    public AdminServiceImpl(AdminRepo adminRepo) {
        this.adminRepo = adminRepo;
    }


    @Override
    public void addAdmin(Admin admin) {
        System.out.println(admin.getEmail());
        System.out.println(admin.getPassword());
        adminRepo.save(admin);
    }

    @Override
    public Boolean checkAdmin(String username, String password) {
        return adminRepo.findAll().stream()
                .anyMatch(a -> a.getUsername().equals(username) && a.getPassword().equals(password));
    }


}
