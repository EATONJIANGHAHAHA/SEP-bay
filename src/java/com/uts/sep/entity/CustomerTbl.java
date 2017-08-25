package com.uts.sep.entity;
// Generated 23-Aug-2017 14:07:11 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;
/**
 * CustomerTbl generated by hbm2java
 */
public class CustomerTbl implements Serializable {


     private int customerId;
     private OrderTbl orderTbl;
     private String customerName;
     private String customerAddress;
     private String email;
     private int creditCardno;
     private Date dob;
     private Set orderTblsForCustomerName = new HashSet(0);
     private Set orderTblsForCustomerId = new HashSet(0);

    public CustomerTbl() {
    }

	
    public CustomerTbl(int customerId, String customerName, String customerAddress, String email, int creditCardno, Date dob) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.email = email;
        this.creditCardno = creditCardno;
        this.dob = dob;
    }
    public CustomerTbl(int customerId, OrderTbl orderTbl, String customerName, String customerAddress, String email, int creditCardno, Date dob, Set orderTblsForCustomerName, Set orderTblsForCustomerId) {
       this.customerId = customerId;
       this.orderTbl = orderTbl;
       this.customerName = customerName;
       this.customerAddress = customerAddress;
       this.email = email;
       this.creditCardno = creditCardno;
       this.dob = dob;
       this.orderTblsForCustomerName = orderTblsForCustomerName;
       this.orderTblsForCustomerId = orderTblsForCustomerId;
    }
   
    public int getCustomerId() {
        return this.customerId;
    }
    
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public OrderTbl getOrderTbl() {
        return this.orderTbl;
    }
    
    public void setOrderTbl(OrderTbl orderTbl) {
        this.orderTbl = orderTbl;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getCustomerAddress() {
        return this.customerAddress;
    }
    
    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public int getCreditCardno() {
        return this.creditCardno;
    }
    
    public void setCreditCardno(int creditCardno) {
        this.creditCardno = creditCardno;
    }
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public Set getOrderTblsForCustomerName() {
        return this.orderTblsForCustomerName;
    }
    
    public void setOrderTblsForCustomerName(Set orderTblsForCustomerName) {
        this.orderTblsForCustomerName = orderTblsForCustomerName;
    }
    public Set getOrderTblsForCustomerId() {
        return this.orderTblsForCustomerId;
    }
    
    public void setOrderTblsForCustomerId(Set orderTblsForCustomerId) {
        this.orderTblsForCustomerId = orderTblsForCustomerId;
    }




}


