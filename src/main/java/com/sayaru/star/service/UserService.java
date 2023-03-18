package com.sayaru.star.service;

import com.sayaru.star.mapper.UserMapper;
import com.sayaru.star.vo.DAttUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<DAttUserVO> getUserInfo(){
        return userMapper.selectUserInfo();
    }
}
