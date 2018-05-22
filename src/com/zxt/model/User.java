package com.zxt.model;

public class User {
    private int userId;
    private String UserName;
    private String UserEmail;

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return UserName;
    }
    public void setUserName(String userName) {
        UserName = userName;
    }
    public String getUserEmail() {
        return UserEmail;
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
