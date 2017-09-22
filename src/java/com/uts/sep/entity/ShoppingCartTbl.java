/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.sep.entity;

import java.io.Serializable;

/**
 *
 * @author eaton
 */
public class ShoppingCartTbl implements Serializable{
    
    private Integer itemId;
    private Integer quantity;
    private Integer userId;

    public ShoppingCartTbl(){
    }
    
    public ShoppingCartTbl(Integer itemId, Integer quantity, Integer userId) {
        this.itemId = itemId;
        this.quantity = quantity;
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
    
    
}
