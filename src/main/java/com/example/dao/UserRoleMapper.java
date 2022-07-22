package com.example.dao;

import com.example.pojo.po.UserPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserRoleMapper {

    List<UserPo> selectAll();

    UserPo selectByUserId(@Param("userId") Long userId);


}
