package com.example.springbootsecurity.pojo;

public class UserRole {
    private Integer id;

    private Integer userid;

    private Integer roleid;

    public UserRole(Integer id, Integer userid, Integer roleid) {
        this.id = id;
        this.userid = userid;
        this.roleid = roleid;
    }

    public UserRole() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}