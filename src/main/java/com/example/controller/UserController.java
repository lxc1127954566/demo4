package com.example.controller;


import com.example.pojo.dto.ReturnDTO;
import com.example.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    @Autowired
    UserRoleService userRoleServiceImp;

    @GetMapping(value = "/getAll")
    public ReturnDTO getAll(){
        return ReturnDTO.success().addList("getAll",userRoleServiceImp.selList());
    }
}
