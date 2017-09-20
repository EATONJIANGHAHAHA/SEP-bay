package com.uts.sep.entity;
// Generated 23-Aug-2017 14:07:11 by Hibernate Tools 4.3.1

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * UserTbl generated by hbm2java
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserTbl implements Serializable {
    @XmlElement(name = "userId")
    private Integer userId;
    @XmlElement(name = "userName")
    private String userName;
    @XmlElement(name = "userPassword")
    private String userPassword;
    @XmlElement(name = "loginStatus")
    private int loginStatus;

    public UserTbl() {
    }

    public UserTbl(String userName, String userPassword, int loginStatus) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.loginStatus = loginStatus;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return this.userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getLoginStatus() {
        return this.loginStatus;
    }

    public void setLoginStatus(int loginStatus) {
        this.loginStatus = loginStatus;
    }
}
