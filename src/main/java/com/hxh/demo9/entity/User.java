package com.hxh.demo9.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * id : 1
     * username : test
     * realname : fds
     * password : 202cb962ac59075b964b07152d234b70
     * gender : 0
     */

    private int id;
    private String username;
    private String realname;
    private String password;
    private String gender;

    public User() {
    }

    public User(int id, String username, String realname, String password, String gender) {
        this.id = id;
        this.username = username;
        this.realname = realname;
        this.password = password;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
