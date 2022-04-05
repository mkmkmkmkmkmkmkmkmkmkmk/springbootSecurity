package com.example.springbootsecurity.pojo;

import java.util.Date;

public class OauthCode {
    private String code;

    private Date createTime;

    private byte[] authentication;

    public OauthCode(String code, Date createTime, byte[] authentication) {
        this.code = code;
        this.createTime = createTime;
        this.authentication = authentication;
    }

    public OauthCode() {
        super();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public byte[] getAuthentication() {
        return authentication;
    }

    public void setAuthentication(byte[] authentication) {
        this.authentication = authentication;
    }
}