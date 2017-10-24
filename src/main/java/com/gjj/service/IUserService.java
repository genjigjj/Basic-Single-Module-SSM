package com.gjj.service;

import com.gjj.pojo.User;

public interface IUserService {

    public void addUser(User user);

    public  User getById(int recordId);
}
