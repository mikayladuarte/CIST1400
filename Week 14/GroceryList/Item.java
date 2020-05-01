// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// This is the item object, which will be used by our grocery driver class

public class Item {
   // Instance variables
   private String item; 
   private int quantity;
   private static final int MIN = 1;
   private static final int MAX = 20;
   
   // Constructors
   public Item() {
      this.item = "none";
      this.quantity = MIN;
   }
   
   public Item(String n, int q) {
      this.item = "none";
      this.quantity = MIN;
      setItem(n);
      setQuantity(q);
   }
   
   // Getters
   public String getItem() {
      return this.item;
   }
   
   public int getQuantity() {
      return this.quantity;
   }
   
   // Setters
   public void setItem(String n) {
      if (!n.isEmpty()) 
      {
         this.item = n;
      }
   }
   
   public void setQuantity(int q) {
      if (q <= MAX && q >= MIN)
      {
         this.quantity = q;
      }
   }
   
   // Increase the quantity of an item by 1
   public void increaseQuant() {
      if (this.quantity < MAX)
      {
         this.quantity++;
      }
   }
   
   // toString
   @Override
   public String toString() {
      return this.item + " : " + this.quantity;
   }
   
   // equals
   @Override
   public boolean equals(Object other) {
      if (other instanceof Item) 
      {
         Item o = (Item) other;
         if (o.getItem().toLowerCase().equals(this.item.toLowerCase()) 
            && o.getQuantity() == this.quantity) 
         {
            return true;
         }
      }
      
      return false;
   }
}