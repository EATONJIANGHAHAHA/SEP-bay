/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.sep.action;

import com.opensymphony.xwork2.ActionSupport;
//import com.uts.sep.dao.userDAO;
//import entity.UserTbl;
//import java.util.List;
import org.apache.struts2.interceptor.ServletRequestAware;

/**
 *
 * @author lzy
 */
public class LoginAction extends ActionSupport {
    
    private String username;
    private String password;
    
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
        /*
        userDAO dao = new userDAO();
        List<UserTbl> list = dao.getAllUsers();
        
          for (int i = 0; i < list.size(); i++) {
            UserTbl user = new UserTbl();
            user = list.get(i);
            if(user.getUserName().equals(username)&& user.getUserPassword().equals(password))
                return SUCCESS;
            else
                return ERROR;
            
        }  */
          return SUCCESS;
    }
    
}
