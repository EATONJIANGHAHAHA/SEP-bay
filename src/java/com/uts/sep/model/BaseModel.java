/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.sep.model;

import java.io.Serializable;
/**
 *  by implementing interface Serializable, the class are now usable for
 * jsb projects, (JavaBeans)
 * @author tomat
 */
public abstract class BaseModel implements Serializable{
    public void saveModel(Object object){
        //
    }
    
    public Object readMedol(){
        Object object = new Object();
        //implementation for reading model information.
        //functions can be edit later for all sub classes.
        return object;
    }
}
