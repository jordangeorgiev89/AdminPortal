package com.example.demo.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private Long id; //primary key
    private String userId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String email;
    private String profileImageUrl;
    private Date lastLoginDate; //the last time they loged
    private Date lastLoginDateDisplay;
    private Date joinDate;
    private String[] roles; //ROLE_USER, ROLE_ADMIN
    private
}