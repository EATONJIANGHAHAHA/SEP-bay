/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.sep.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import com.uts.sep.dao.BaseDAO;
import com.uts.sep.dao.UserDAO;
import com.uts.sep.entity.UserTbl;
import java.util.List;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

/**
 *
 * @author lzy
 */
public class RegisterAction extends ActionSupport implements SessionAware {
    
    public static final String ERROR_NAME = "error_name";
    public static final String USER_NAME = "user_name";

    private String username = "";
    private String password = "";
    private String repeatedPassword = "";
    private Map session;

    @Override
    public void setSession(Map session) {
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

    public String getrepeatedPassword() {
        return repeatedPassword;
    }

    public void setRepeatedPassword(String repeatedPassword) {
        this.repeatedPassword = repeatedPassword;
    }

    @Override
    public String execute() throws Exception {

        UserDAO userDao = new UserDAO();
        List<UserTbl> list = userDao.getAll(BaseDAO.USER_TBL);
        UserTbl usingUser = null;
        
        if(username.equals("") || password.equals("") || repeatedPassword.equals("")){
            this.session.put(ERROR_NAME, "form not complete");
            return ERROR;
        }
        for (UserTbl user: list){
            if(user.getUserName().equals(username)){
                this.session.put(ERROR_NAME, "user already exist");
                return MyAction.USER_EXISTS;
            }
        }
        if (password.equals(repeatedPassword)) {
            this.session.put(USER_NAME, username);
            UserTbl user = new UserTbl(username, password, 1);
            userDao.insertNew(user);
            return SUCCESS;
        } else return ERROR;
    }

    /**
     * this class customasing the result string which can be used later on.
     */
    public class MyAction implements Action {
        
        public static final String USER_EXISTS = "user exists";
        

        @Override
        public String execute() throws Exception {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }   
    }
}
