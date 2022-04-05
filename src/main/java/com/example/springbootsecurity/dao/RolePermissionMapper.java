package com.example.springbootsecurity.dao;

import com.example.springbootsecurity.pojo.RolePermission;

public interface RolePermissionMapper {
    int insert(RolePermission record);

    int insertSelective(RolePermission record);
}