/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uts.sep.model;

import java.util.ArrayList;

/**
 *
 * @author tomat
 */
public class ShoppingCart extends BaseModel{
    
    int shoppingCartID;
    int quantity;
    ArrayList<CartItem> items;

    public int getShoppingCartID() {
        return shoppingCartID;
    }

    public void setShoppingCartID(int shoppingCartID) {
        this.shoppingCartID = shoppingCartID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<CartItem> items) {
        this.items = items;
    }

    public ShoppingCart(int shoppingCartID, int quantity, ArrayList<CartItem> items) {
        this.shoppingCartID = shoppingCartID;
        this.quantity = quantity;
        this.items = items;
    }

    public ShoppingCart() {
    }
}