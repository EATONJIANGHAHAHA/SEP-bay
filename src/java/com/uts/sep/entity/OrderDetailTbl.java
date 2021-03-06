package com.uts.sep.entity;
// Generated 23-Aug-2017 14:07:11 by Hibernate Tools 4.3.1


import java.io.Serializable;
/**
 * OrderDetailTbl generated by hbm2java
 */
public class OrderDetailTbl  implements Serializable {


     private OrderDetailTblId id;
     private ItemTbl itemTbl;
     private OrderTbl orderTbl;
     private int quantity;
     private String orderDetailName;
     private double unitCost;
     private double subtotal;

    public OrderDetailTbl() {
    }

    public OrderDetailTbl(OrderDetailTblId id, ItemTbl itemTbl, OrderTbl orderTbl, int quantity, String orderDetailName, double unitCost, double subtotal) {
       this.id = id;
       this.itemTbl = itemTbl;
       this.orderTbl = orderTbl;
       this.quantity = quantity;
       this.orderDetailName = orderDetailName;
       this.unitCost = unitCost;
       this.subtotal = subtotal;
    }
   
    public OrderDetailTblId getId() {
        return this.id;
    }
    
    public void setId(OrderDetailTblId id) {
        this.id = id;
    }
    public ItemTbl getItemTbl() {
        return this.itemTbl;
    }
    
    public void setItemTbl(ItemTbl itemTbl) {
        this.itemTbl = itemTbl;
    }
    public OrderTbl getOrderTbl() {
        return this.orderTbl;
    }
    
    public void setOrderTbl(OrderTbl orderTbl) {
        this.orderTbl = orderTbl;
    }
    public int getQuantity() {
        return this.quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public String getOrderDetailName() {
        return this.orderDetailName;
    }
    
    public void setOrderDetailName(String orderDetailName) {
        this.orderDetailName = orderDetailName;
    }
    public double getUnitCost() {
        return this.unitCost;
    }
    
    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
    public double getSubtotal() {
        return this.subtotal;
    }
    
    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }




}


