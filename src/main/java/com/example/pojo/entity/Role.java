package com.example.pojo.entity;

import lombok.Data;

import java.util.List;


@Data
public class Role {

    private Long roleId;
    private String roleName;
    private String description;
    private List<Permission> permissions;
}
