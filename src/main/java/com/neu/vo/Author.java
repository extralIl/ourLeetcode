package com.neu.vo;

import org.apache.catalina.User;

public class Author {
    private String userName;//用户的自定义域名
    private String realName;//用户名
    private String userAvatar;//头像url

    public Author(String userName, String realName, String userAvatar) {
        this.userName = userName;
        this.realName = realName;
        this.userAvatar = userAvatar;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar;
    }
}
