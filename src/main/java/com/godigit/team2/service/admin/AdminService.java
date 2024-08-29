package com.godigit.team2.service.admin;

import com.godigit.team2.entity.admin.Admin;

public interface AdminService {
    public void addAdmin(Admin admin);
    public Boolean checkAdmin(String username, String password);
}
