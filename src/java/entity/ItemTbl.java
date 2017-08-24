package entity;
// Generated 23-Aug-2017 14:07:11 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import java.io.Serializable;
/**
 * ItemTbl generated by hbm2java
 */
public class ItemTbl  implements Serializable {


     private int itemId;
     private String itemName;
     private String itemDescription;
     private int stock;
     private int itemStatus;
     private double price;
     private Set orderDetailTbls = new HashSet(0);

    public ItemTbl() {
    }

	
    public ItemTbl(int itemId, String itemName, int stock, int itemStatus, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.stock = stock;
        this.itemStatus = itemStatus;
        this.price = price;
    }
    public ItemTbl(int itemId, String itemName, String itemDescription, int stock, int itemStatus, double price, Set orderDetailTbls) {
       this.itemId = itemId;
       this.itemName = itemName;
       this.itemDescription = itemDescription;
       this.stock = stock;
       this.itemStatus = itemStatus;
       this.price = price;
       this.orderDetailTbls = orderDetailTbls;
    }
   
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public String getItemName() {
        return this.itemName;
    }
    
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
    public String getItemDescription() {
        return this.itemDescription;
    }
    
    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
    public int getStock() {
        return this.stock;
    }
    
    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getItemStatus() {
        return this.itemStatus;
    }
    
    public void setItemStatus(int itemStatus) {
        this.itemStatus = itemStatus;
    }
    public double getPrice() {
        return this.price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    public Set getOrderDetailTbls() {
        return this.orderDetailTbls;
    }
    
    public void setOrderDetailTbls(Set orderDetailTbls) {
        this.orderDetailTbls = orderDetailTbls;
    }




}

