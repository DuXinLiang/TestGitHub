package com.baige.dao;

import com.baige.entity.User;

import java.util.List;

public interface IUserDao {

    // 查询所有User信息
    List<User> listUser();
}
