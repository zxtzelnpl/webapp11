package com.zxt.entity;

import java.math.BigDecimal;

public class User {

    private BigDecimal id;
    private String username;
    private String sex;

    public BigDecimal getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getSex() {
        return sex;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

}
