/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.sep.dao;

import org.hibernate.Session;
import entity.*;
import java.io.Serializable;
import java.util.*;
import org.hibernate.Transaction;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author lzy
 */
public class userDAO implements Serializable {
    private static SessionFactory factory;
    // method to read all the users
    public List<UserTbl> getUsers(){
        Session session = factory.openSession();
        Transaction tx = null;
        List<UserTbl> list = null;
        try{
            tx = session.beginTransaction();
            list =session.createQuery("FROM user_tbl by user_id desc").list();
            tx.commit();
        }
        catch(HibernateException e){
         if (tx!=null) tx.rollback();
         e.printStackTrace();
         }
        finally {
         session.close(); 
      }
        return list;
    }
    
    //method tp update status
    public void updateLoginStatus(Integer userId,int status){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
        tx= session.beginTransaction();
        UserTbl user = (UserTbl) session.get(UserTbl.class, userId);
        user.setLoginStatus(status);
        session.update(user);
        tx.commit();
      }
      catch (HibernateException e){
        if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }
      finally{
          session.close();
      }

    }
    
    
    //method to upadte password
    public void updatePassword(Integer userId, String pwd){
      Session session = factory.openSession();
      Transaction tx = null;
      
      try{
        tx= session.beginTransaction();
        UserTbl user = (UserTbl) session.get(UserTbl.class, userId);
        user.setUserPassword(pwd);
        session.update(user);
        tx.commit();
      }
      catch (HibernateException e){
        if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }
      finally{
          session.close();
      }
    }
    
    //method to add users
    public void insertUser(String name,String pwd){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
      tx = session.beginTransaction();
      UserTbl user = new UserTbl(name,pwd,0);
      session.save(user); 
      tx.commit();
      }
      catch (HibernateException e){
        if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }
      finally{
          session.close();
      }
    
    }
    
    //method to delete users
    public void deleteUser(Integer userId){
      Session session = factory.openSession();
      Transaction tx = null;
      try{
      tx = session.beginTransaction();
      UserTbl user = (UserTbl) session.get(UserTbl.class,userId);
      session.delete(user);
      tx.commit();
      }
      catch (HibernateException e){
        if (tx!=null) tx.rollback();
         e.printStackTrace(); 
      }
      finally{
          session.close();
      }
    
    
    }
        

}
