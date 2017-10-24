package com.gjj.service.impl;

import com.gjj.mapper.UserMapper;
import com.gjj.pojo.User;
import com.gjj.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSerivceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(User user) {
        userMapper.insert(user);
    }

    @Override
    public User getById(int recordId) {
        return userMapper.selectByPrimaryKey(recordId);
    }
}
