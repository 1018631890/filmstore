package com.example.SpringTset02.bean;

import java.io.Serializable;

public class Account {
    private Integer account_id;
    private String account_name;
    private String account_password;
    private String type;
    private String email;
    public Account account;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() { return type; }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAccount_id() {
        return account_id;
    }

    public String getAccount_name() {
        return account_name;
    }

    public String getAccount_password() {
        return account_password;
    }

    public void setAccount_id(Integer account_id) {
        this.account_id = account_id;
    }

    public void setAccount_name(String account_name) {
        this.account_name = account_name;
    }

    public void setAccount_password(String account_password) {
        this.account_password = account_password;
    }
}
