package com.example.pojo.entity;

import lombok.Data;

import java.util.List;

@Data
public class User{

    private Long userId;
    private String userName;
    private String passWord;
    private List<Role> roleList;

}
