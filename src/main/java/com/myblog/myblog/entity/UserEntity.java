package com.myblog.myblog.entity;


/**
 * @Author:zyk
 * @Description: 用户表
 * @Date:Create in 10:50 2017/11/22
 * @Modified By:
 **/
public class UserEntity extends BaseEntity {


    private String username;
    private String password;
    private Long deptid;
    private String deptname;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getDeptid() {
        return deptid;
    }

    public void setDeptid(Long deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
}
