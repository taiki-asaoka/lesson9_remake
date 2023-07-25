package com.example.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;



public class UserDetail extends User {
    private static final long serialVersionUID = 1L;

    public UserDetail(com.example.demo.entity.User user) {
    	super(
                user.getAuthentication().getLoginUser(),
                user.getAuthentication().getPassword(),
                true,
                user.getAuthentication().getValidDate().toLocalDate().compareTo(LocalDate.now()) >= 0,
                true,
                true,
                new ArrayList<GrantedAuthority>()
        );
    }
}