package com.sayaru.star.controller;

import com.sayaru.star.service.UserService;
import com.sayaru.star.vo.DAttUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public UserService userService;

    @GetMapping("/login")
    public List<DAttUserVO> login(){
        List<DAttUserVO> userList = userService.getUserInfo();
        return userList;
    }
}
