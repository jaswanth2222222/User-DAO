package com.example.Model;

import java.util.Date;

public class User {
    private int userId;
    private String username;
    private String password;
    private String email;
    private String address;
    private String role;
    private Date createDate;
    private Date lastLogicDate;

// Second time updating Git Repository

    
    public User(int userId, String username, String email, String password, String address, String role, Date createDate, Date lastLogicDate) {
        this.userId = userId;
        this.username = username;
        this.email = email;
        this.password = password;
        this.address = address;
        this.role = role;
        this.createDate = createDate;
        this.lastLogicDate = lastLogicDate;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastLogicDate() {
        return lastLogicDate;
    }

    public void setLastLogicDate(Date lastLogicDate) {
        this.lastLogicDate = lastLogicDate;
    }
}
