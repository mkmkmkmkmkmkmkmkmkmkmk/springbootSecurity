package com.example.springbootsecurity.pojo;

public class Permission {
    private Integer id;

    private String name;

    private Integer pid;

    private String url;

    private String icon;

    public Permission(Integer id, String name, Integer pid, String url, String icon) {
        this.id = id;
        this.name = name;
        this.pid = pid;
        this.url = url;
        this.icon = icon;
    }

    public Permission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }
}