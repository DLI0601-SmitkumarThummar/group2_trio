package com.godigit.team2.dto;

import com.godigit.team2.entity.user.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO {
    private User user;
    private String name;
    private String email;
    private String address;
    private String phone;
}
