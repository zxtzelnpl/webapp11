package com.zxt.model;

public class User {

    private int userId;
    private String UserName;
    private String UserPassword;
    private String userSex;
    private String userHome;
    private String userInfo;
    private String UserEmail;

    public int getUserId() {
        return userId;
    }

    public String getUserName() {
        return UserName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public String getUserSex() {
        return userSex;
    }

    public String getUserHome() {
        return userHome;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public String getUserEmail() {
        return UserEmail;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    public void setUserHome(String userHome) {
        this.userHome = userHome;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public void setUserEmail(String userEmail) {
        UserEmail = userEmail;
    }


    @Override
    public String toString() {
        return "User [userId=" + userId + ", UserName=" + UserName
                + ", UserEmail=" + UserEmail + "]";
    }


}
