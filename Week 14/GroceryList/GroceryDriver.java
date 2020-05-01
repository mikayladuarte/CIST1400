// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// This is the grocery list driver, it manages the grocery list through
// the grocerylist object

import java.util.Scanner;

public class GroceryDriver {
   public static void main(String[] args) {
      // Initialize scanner
      Scanner input = new Scanner(System.in);
      
      // Initialize GroceryList object
      GroceryList groceryList = new GroceryList();
      
      // Loop until the user quits
      boolean quit = false;
      do
      {
         // Print the options
         System.out.println("1. Print the grocery list");
         System.out.println("2. Print the number of different items in the list");
         System.out.println("3. Print the total number of grocery items to be purchased");
         System.out.println("4. Add an item");
         System.out.println("5. Remove an item");
         System.out.println("6. Increase the quantity of an item");
         System.out.println("7. Sort the items by quantity");
         System.out.println("8. Sort the items by name");
         System.out.println("9. Quit");
         System.out.print("Enter choice: ");
         
         // Read the users choice
         int choice = input.nextInt();
         
         switch (choice) {
            // Print the grocery list
            case 1 :
               System.out.println("Grocery list is: ");
               System.out.println(groceryList);
               break;
               
            // Print number of different items in the list
            case 2 :
               System.out.println("Number of unique items: " + groceryList.getCount() + "\n");
               break;
               
            // Print total number of items to be purchased
            case 3 :
               System.out.println("Total grocery items: " + groceryList.sumQuantity() + "\n");
               break;
               
            // Add an item
            case 4 :
               System.out.println("Enter item");
               input.nextLine();
               String newItem = input.nextLine();
               
               int newQuantity = -1;
               do
               {
                  System.out.println("Enter quantity");
                  newQuantity = input.nextInt();
               } while (newQuantity < 1 || newQuantity > 20);
               
               System.out.println();
               groceryList.addItem(new Item(newItem, newQuantity));
               
               break;
            
            // Remove an item
            case 5 :
               System.out.println("Here is the list of items");
               System.out.println(groceryList);
               System.out.println("Enter the number of item to delete");
               int delItem = input.nextInt();
               
               if (delItem > groceryList.getCount() || delItem < 0) 
               {
                  System.out.println("Item does not exist");
                  System.out.println();
               }
               else 
               {
                  groceryList.deleteItem(delItem);
               }
               break;
               
            // Increase quantity of an item
            case 6 :
               System.out.println("Here is the list of items");
               System.out.println(groceryList);
               System.out.println("Enter the number of item for quantity increase");
               int incItem = input.nextInt();
               
               if (incItem > groceryList.getCount() || incItem < 0)
               {
                  System.out.println("Item does not exist\n");
               }
               else
               {
                  groceryList.increaseQuant(incItem);
                  System.out.println();
               }
               break;
               
            // Sort by quantity
            case 7 :
               System.out.println("Groceries Sorted by Quantity:");
               Item[] sortedItemsQuant = groceryList.sortQuant();
               GroceryList sortedListQuant = new GroceryList(sortedItemsQuant);
               System.out.println(sortedListQuant);
               break;
               
            // Sort by name
            case 8 :
               System.out.println("Groceries Sorted by Name:");
               Item[] sortedItemsName = groceryList.sortName();
               GroceryList sortedListName = new GroceryList(sortedItemsName);
               System.out.println(sortedListName);
               break;
               
            // Quit
            case 9 :
               quit = true;
               break;
               
            // Invalid choice
            default :
               System.out.println("Invalid selection.");
               break;
         }
         
      } while (!quit);
   }
}