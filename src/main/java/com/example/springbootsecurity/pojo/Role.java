package com.example.springbootsecurity.pojo;

import java.util.Date;

public class Role {
    private String id;

    private String roleName;

    private String description;

    private Date createTime;

    private Date updateTime;

    private String status;

    public Role(String id, String roleName, String description, Date createTime, Date updateTime, String status) {
        this.id = id;
        this.roleName = roleName;
        this.description = description;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.status = status;
    }

    public Role() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}