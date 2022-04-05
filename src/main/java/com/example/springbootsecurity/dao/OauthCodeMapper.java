package com.example.springbootsecurity.dao;

import com.example.springbootsecurity.pojo.OauthCode;

public interface OauthCodeMapper {
    int insert(OauthCode record);

    int insertSelective(OauthCode record);
}