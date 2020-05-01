// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// This is the grocery list object, which will be used by our grocery driver class
// and holds Items

public class GroceryList {
   // Instance variables
   private int count;
   private Item[] list;
   private static final int MAX = 30;
   
   // Constructors
   public GroceryList() {
      this.list = new Item[MAX];
      this.count = 0;
   }
   
   public GroceryList(Item[] source) {
      this.list = new Item[MAX];
      this.count = 0;
      
      for (Item item : source) 
      {
         this.list[this.count] = item;
         this.count++;
      }
   }
   
   // Getters
   public int getCount() {
      return this.count;
   }
   
   public Item getItem(int pos) {
      return this.list[pos];
   }
   
   // Add Item to the List
   public void addItem(Item m) {
      if (this.count < MAX) 
      {
         this.list[count] = m;
         this.count++;
      }
   }
   
   // Remove Item from the List
   public void deleteItem(int p) {
      int pos = p - 1;
      
      // If the item exists, then we'll delete it
      if (pos >= 0 && pos < MAX && this.list[pos] != null) 
      {
         this.list[pos] = null;
         
         // If the item was not at the end of the list, then we need to shift things
         if (pos != (this.count - 1)) 
         {
            // Shift all the items to the left starting at the deleted item
            for (int i = pos; i < this.count - 1; i++)
            {
               this.list[i] = this.list[i + 1];
            }
         }
         
         // Delete the last item either way
         this.list[this.count - 1] = null;
         
         // Decrement the count
         this.count--;
      }
   }
   
   // Sort Items by Name - Bubble sort
   public Item[] sortName() {      
      Item[] sortedList = new Item[MAX];
      for (int i = 0; i < MAX; i++) 
      {
         sortedList[i] = this.list[i];
      }
      
      for (int pass = 0; pass < this.count - 1; pass++) 
      {
         for (int pos = 0; pos < this.count - 1; pos++)
         {
            if (sortedList[pos].getItem().compareToIgnoreCase(sortedList[pos + 1].getItem()) > 0)
            {
               Item temp = sortedList[pos];
               sortedList[pos] = sortedList[pos + 1];
               sortedList[pos + 1] = temp; 
            }
         }
      } 
      
      return sortedList;
   }
   
   // Sort Items by Their Quantities - Selection sort
   public Item[] sortQuant() {     
      Item[] sortedList = new Item[MAX];
      for (int i = 0; i < MAX; i++) 
      {
         sortedList[i] = this.list[i];
      }
      
      int largest;
      for (int pos = 0; pos < this.count - 1; pos++) 
      {
         largest = pos;
         for (int i = pos + 1; i < this.count; i++) 
         {
            if (sortedList[i].getQuantity() > sortedList[largest].getQuantity())
            {
               largest = i;
            }
         }
            
         Item temp = sortedList[largest];
         sortedList[largest] = sortedList[pos];
         sortedList[pos] = temp;
      }
      
      return sortedList;
   } 
   
   // Sum the quantity of each item in the list
   public int sumQuantity() {
      int sum = 0;
      for (int i = 0; i < this.count; i++) 
      {
         sum += this.list[i].getQuantity();
      }
      
      return sum;
   }
   
   // Increase an items quantity
   public void increaseQuant(int p) {
      int pos = p - 1;
      if (pos >= 0 && pos < this.count) 
      {
         this.list[pos].increaseQuant();
      }
   }
   
   // toString
   @Override
   public String toString() {
      int counter = 1;
      String returnString = "";
      
      for (Item item : this.list) 
      {
         if (item != null) 
         {
            returnString += counter + ". " + item + "\n";
            counter += 1;
         }
      }
      
      return returnString;
   }
   
   // equals
   @Override
   public boolean equals(Object other) {
      if (other instanceof GroceryList)
      {
         GroceryList o = (GroceryList) other;
         if (this.count == o.getCount()) 
         {
            Item[] sorted1 = this.sortName();
            Item[] sorted2 = o.sortName();
            
            for (int i = 0; i < this.count; i++) 
            {
               if (!sorted1[i].getItem().toLowerCase().equals(sorted2[i].getItem().toLowerCase()) 
                  || sorted1[i].getQuantity() != sorted2[i].getQuantity())
               {
                  return false;
               }
            }
            
            return true;
         }
      }
          
      return false;
   }
}