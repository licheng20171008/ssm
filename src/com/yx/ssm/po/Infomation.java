package com.yx.ssm.po;

/**
 * 
 * 
 * @author licheng
 * 
 * @date 2017-10-16
 */
public class Infomation {
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}