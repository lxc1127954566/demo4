package com.example.service;

import com.example.dao.UserRoleMapper;
import com.example.pojo.po.UserPo;
import com.example.pojo.vo.UserVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserRoleServiceImp implements UserRoleService{

    @Autowired
    UserRoleMapper userRoleMapper;

    @Override
    public List<UserVo> selList() {
        List<UserPo> userPos = userRoleMapper.selectAll();
        List<UserVo> list = new ArrayList<UserVo>();
        UserVo userVos = new UserVo();
        for(UserPo o : userPos){
            userVos.setUserName(o.getUserName());
            userVos.setRoleName(o.getRoleName());
            userVos.setPermissionName(o.getPermissionName());
            list.add(userVos);
        }
        return list;
    }

    @Override
    public UserVo selByUserId(Long userId) {
        UserPo userPo = userRoleMapper.selectByUserId(userId);
        UserVo userVo = new UserVo();
        userVo.setUserName(userPo.getUserName());
        userVo.setRoleName(userPo.getRoleName());
        userVo.setPermissionName(userPo.getPermissionName());
        return userVo;
    }
}
