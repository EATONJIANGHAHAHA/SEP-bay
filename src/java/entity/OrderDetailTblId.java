package entity;
// Generated 23-Aug-2017 14:07:11 by Hibernate Tools 4.3.1


import java.io.Serializable;
/**
 * OrderDetailTblId generated by hbm2java
 */
public class OrderDetailTblId  implements Serializable {


     private int orderId;
     private int itemId;

    public OrderDetailTblId() {
    }

    public OrderDetailTblId(int orderId, int itemId) {
       this.orderId = orderId;
       this.itemId = itemId;
    }
   
    public int getOrderId() {
        return this.orderId;
    }
    
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public int getItemId() {
        return this.itemId;
    }
    
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof OrderDetailTblId) ) return false;
		 OrderDetailTblId castOther = ( OrderDetailTblId ) other; 
         
		 return (this.getOrderId()==castOther.getOrderId())
 && (this.getItemId()==castOther.getItemId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getOrderId();
         result = 37 * result + this.getItemId();
         return result;
   }   


}


