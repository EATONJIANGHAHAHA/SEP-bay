/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.sep.action;

import com.opensymphony.xwork2.ActionSupport;
import com.uts.sep.dao.UserDAO;

/**
 *
 * @author lzy
 */
public class RegisterAction extends ActionSupport {
    private String username = "";
    private String password = "";
    
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


    
    public String execute() throws Exception {
        UserDAO dao = new UserDAO();
        dao.insertUser(username,password);
        return SUCCESS;
    }
    
}
