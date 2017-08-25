/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.sep.dao;

import com.uts.sep.entity.UserTbl;
import org.hibernate.Session;
import java.io.Serializable;
import java.util.*;
import org.hibernate.Transaction;
import org.hibernate.*;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metamodel.Metadata;
import org.hibernate.metamodel.MetadataSources;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author lzy
 */
public class userDAO {

    private static SessionFactory factory = null;
    private static ServiceRegistry serviceRegistry = null;
    private static Configuration configuration = null;
    
    /**
     * this method is to convert generated list into array list.
     * @param users
     * @return 
     */
    public ArrayList<UserTbl> convertListToArrayList(List<UserTbl> users) {
        ArrayList<UserTbl> arrayListUsers = null;
        for (UserTbl user : users) {
            arrayListUsers.add(user);
        }
        return arrayListUsers;
    }

    /**
     * this method is to get all users
     *
     * @return
     */
    public ArrayList<UserTbl> getAllUsers() {
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        List<UserTbl> list = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("from UserTbl");
            list = query.list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return convertListToArrayList(list);
    }

    public UserTbl getUser(Integer userID) {
        ArrayList<UserTbl> users = getAllUsers();
        for (UserTbl user:users){
            if(Objects.equals(userID, user.getUserId())){
                return user;
            }
        }
        return null;
    }

    /**
     *
     * @param userId
     * @param status
     */
    public void updateLoginStatus(Integer userId, int status) {
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            UserTbl user = (UserTbl) session.get(UserTbl.class, userId);
            user.setLoginStatus(status);
            session.update(user);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    //method to upadte password
    public void updatePassword(Integer userId, String pwd) {
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            UserTbl user = (UserTbl) session.get(UserTbl.class, userId);
            user.setUserPassword(pwd);
            session.update(user);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    //method to add users
    public void insertUser(String name, String pwd) {
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            UserTbl user = new UserTbl(name, pwd, 0);
            session.save(user);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }

    }

    //method to delete users
    public void deleteUser(Integer userId) {
        factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            UserTbl user = (UserTbl) session.get(UserTbl.class, userId);
            session.delete(user);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
