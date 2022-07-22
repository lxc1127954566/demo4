package com.example.service;


import com.example.pojo.vo.UserVo;

import java.util.List;

public interface UserRoleService {

    List<UserVo> selList();

    UserVo selByUserId(Long userId);
}
