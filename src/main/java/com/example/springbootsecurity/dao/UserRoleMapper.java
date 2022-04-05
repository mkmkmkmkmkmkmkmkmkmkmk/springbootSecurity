package com.example.springbootsecurity.dao;

import com.example.springbootsecurity.pojo.UserRole;

public interface UserRoleMapper {
    int insert(UserRole record);

    int insertSelective(UserRole record);
}