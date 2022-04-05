package com.example.springbootsecurity.dao;

import com.example.springbootsecurity.pojo.OauthClientDetails;

public interface OauthClientDetailsMapper {
    int insert(OauthClientDetails record);

    int insertSelective(OauthClientDetails record);
}