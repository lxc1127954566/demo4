package com.example.pojo.po;

import lombok.Data;

@Data
public class UserPo {

    private Long userId;
    private String userName;
    private String passWord;
    private Long roleId;
    private String roleName;
    private Long permissionId;
    private String permissionName;
}
