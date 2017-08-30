/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.sep.action;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.uts.sep.dao.userDAO;
import com.uts.sep.model.User;
import com.uts.sep.entity.UserTbl;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author lzy
 */
public class LoginAction extends ActionSupport implements SessionAware {
    
    private String username = "";
    private String password = "";
    private Map session;
    
    public void setSession(Map session){
        this.session = session;  
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

    public String execute() throws Exception {  
        
        this.session.put("user_name",username);
        
        
       
        userDAO dao = new userDAO();
        List<UserTbl> list = dao.getAllUsers();
        UserTbl usingUser = null;
        
          for (UserTbl user: list) {
              if (user.getUserName().equals(username)){
                  usingUser = user;
              }

        }
          if(usingUser.getUserName().equals(username) && usingUser.getUserPassword().equals(password)) 
              return SUCCESS;
          else 
              return ERROR;
    }
    
}