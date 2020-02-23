// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// The purpose of this program is to to discover what kind of meal you can make 
// with the ingredients you have on hand through a decision making tree

import java.util.Scanner;

public class MealPrep {
   public static void main(String[] args) {
      // Initialize scanner object
      Scanner input = new Scanner(System.in);
      
      // Print purpose of program
      System.out.println("Welcome to the Meal Prep Program. Let's see what you can make.");
      
      // Initial question about meat
      System.out.println("Do you have any meat?");
      char meat = input.nextLine().toLowerCase().charAt(0);
      
      // Go through tree based on if the user has meat
      switch (meat) {
         // The user has meat
         case 'y' : 
            System.out.println("Do you have beef, chicken, or other meat?");
            String meatType = input.nextLine().toLowerCase();
            
            switch (meatType) {
               // The user has beef
               case "beef" : 
                  System.out.println("Do you have steak, ground, or roast?");
                  String beefType = input.nextLine().toLowerCase();
                  
                  switch (beefType) {
                     // The user has steak
                     case "steak" : 
                        System.out.println("Do you have potatoes?");
                        char potatoesBeef = input.nextLine().toLowerCase().charAt(0);
                        
                        switch (potatoesBeef) {
                          // The user has steak/potatoes
                           case 'y' : 
                              System.out.println("Do you have salad?");
                              char saladYesPotatoes = input.nextLine().toLowerCase().charAt(0);
                              
                              switch (saladYesPotatoes) {
                                 // The user has steak/potatoes/salad
                                 case 'y' : 
                                    // The user can make Steak, Baked Potato, and Salad
                                    System.out.println("You should make Steak, Baked Potato and Salad");
                                    break;
                                 
                                 // The user just has steak/potatoes
                                 case 'n' : 
                                    System.out.println("Do you have fruit?");
                                    char fruit = input.nextLine().toLowerCase().charAt(0);
                                    
                                    switch (fruit) {
                                       // The user has steak/potatoes/fruit
                                       case 'y' :
                                          System.out.println("You should make Steak, Baked Potato and Fruit");
                                          break;
                                       
                                       // The user just has steak/potatoes
                                       case 'n' : 
                                          System.out.println("You should make Steak and Potato Hash");
                                          break;
                                       
                                       // Invalid response to steak/potatoes/fruit
                                       default :
                                          System.out.println("Invalid response.");
                                          break;
                                    }
                                    break;
                                 
                                 // Invalid response to steak/potatoes/salad
                                 default : 
                                    System.out.println("Invalid response.");
                                    break;
                              }
                              break;
                           
                           // The user just has steak
                           case 'n' : 
                              System.out.println("Do you have salad?");
                              char saladNoPotatoes = input.nextLine().toLowerCase().charAt(0);
                              
                              switch (saladNoPotatoes) {
                                 // The user has steak/salad
                                 case 'y' : 
                                    System.out.println("You should make a Steak Salad");
                                    break;
                                 
                                 // The user just has steak
                                 case 'n' :
                                    System.out.println("You should make a Steak Sandwich");
                                    break;
                                 
                                 // Invalid response to steak/salad
                                 default :
                                    System.out.println("Invalid response.");
                                    break;
                              }
                              break;
                           
                           // Invalid response to steak/potatoes
                           default : 
                              System.out.println("Invalid response.");
                              break;
                        }
                        break;
                     
                     // The user has ground beef
                     case "ground" : 
                        System.out.println("Do you have buns?");
                        char buns = input.nextLine().toLowerCase().charAt(0);
                        
                        switch (buns) {
                           // The user has ground beef/buns
                           case 'y' :
                              System.out.println("You should make hamburgers");
                              break;
                              
                           // The user just has ground beef
                           case 'n' :
                              System.out.println("Do you have rice?");
                              char rice = input.nextLine().toLowerCase().charAt(0);
                              
                              switch (rice) {
                                 // The user has ground beef/rice
                                 case 'y' :
                                    System.out.println("You should make Casserole");
                                    break;
                                    
                                 // The user just has ground beef
                                 case 'n' :
                                    System.out.println("You should make Chili");
                                    break;
                                 
                                 // Invalid response to ground beef/rice
                                 default :
                                    System.out.println("Invalid response.");
                                    break;  
                              
                              }
                              break;
                              
                           // Invalid response to ground beef/buns
                           default :
                              System.out.println("Invalid response.");
                              break;
                        }
                        break;
                     
                     // The user has roast
                     case "roast" : 
                        System.out.println("Do you have potatoes?");
                        char potatoesRoast = input.nextLine().toLowerCase().charAt(0);
                        
                        switch (potatoesRoast) {
                           // The user has roast/potatoes
                           case 'y' :
                              System.out.println("Do you have vegetables?");
                              char vegYesPotatoes = input.nextLine().toLowerCase().charAt(0);
                              
                              switch (vegYesPotatoes) {
                                 // The user has roast/potatoes/vegetables
                                 case 'y' :
                                    System.out.println("You should make Pot Roast and Veggies with Mashed Potatoes");
                                    break;
                                 
                                 // The user has just roast/potatoes
                                 case 'n' :
                                    System.out.println("You should make Roasted Potatoes and Meat");
                                    break;
                                 
                                 // Invalid response to roast/potatoes/vegetables
                                 default :
                                    System.out.println("Invalid response.");
                                    break;
                              }
                              break;
                              
                           // The user just has roast
                           case 'n' :
                              System.out.println("Do you have Vegetables?");
                              char vegNoPotatoes = input.nextLine().toLowerCase().charAt(0);
                              
                              switch (vegNoPotatoes) {
                                 // The user has roast/vegetables
                                 case 'y' :
                                    System.out.println("You should make Meat and Veggie Soup");
                                    break;
                                 
                                 // The user just has roast
                                 case 'n' :
                                    System.out.println("You should make Pot Roast");
                                    break;
                                 
                                 // Invalid response to roast/vegetables
                                 default : 
                                    System.out.println("Invalid response.");
                                    break;
                              }
                              break;
                              
                           // Invalid response to potatoes
                           default :
                              System.out.println("Invalid response.");
                              break;
                        }
                        break;
                     
                     // Invalid response to type of beef
                     default : 
                        System.out.println("Invalid response.");
                        break;
                  }
                  break;
               
               // The user has chicken
               case "chicken" : 
                  System.out.println("Do you have whole chicken or pieces of chicken?");
                  String chickenType = input.nextLine().toLowerCase();
                  
                  switch (chickenType) {
                     // The user has whole chicken
                     case "whole" :
                        System.out.println("Do you have pasta?");
                        char pastaWhole = input.nextLine().toLowerCase().charAt(0);
                        
                        switch (pastaWhole) {
                           // The user has whole chicken/pasta
                           case 'y' :
                              System.out.println("You should make Chicken Pasta Casserole");
                              break;
                              
                           // The user only has whole chicken
                           case 'n' :
                              System.out.println("Do you have rice?");
                              char rice = input.nextLine().toLowerCase().charAt(0);
                              
                              switch (rice) {
                                 // The user has whole chicken/rice
                                 case 'y' :
                                    System.out.println("Do you have vegetables?");
                                    char vegetablesWhole = input.nextLine().toLowerCase().charAt(0);
                                    
                                    switch (vegetablesWhole) {
                                       // The user has whole chicken/rice/vegetables
                                       case 'y' :
                                          System.out.println("You should make Stir Fry");
                                          break;
                                       
                                       // The user only has whole chicken/rice
                                       case 'n' :
                                          System.out.println("You should make Chicken Rice Casserole");
                                          break;
                                          
                                       // Invalid response to whole chicken/rice/vegetables
                                       default :
                                          System.out.println("Invalid response.");
                                          break;
                                    }
                                    break;
                                 
                                 // The user only has whole chicken
                                 case 'n' :
                                    System.out.println("You should make Smoked Chicken");
                                    break;
                                    
                                // Invalid response to whole chicken/rice
                                 default :
                                    System.out.println("Invalid response.");
                                    break;
                              }
                              break;
                           
                           // Invalid response to whole chicken/pasta
                           default :
                              System.out.println("Invalid response.");
                              break;
                        }
                        break;
                                                
                     // The user has chicken pieces  
                     case "pieces" :
                        System.out.println("Do you have vegetables?");
                        char vegetablesPieces = input.nextLine().toLowerCase().charAt(0);
                        
                        switch (vegetablesPieces) {
                           // The user has chicken pieces/vegetables
                           case 'y' :
                              System.out.println("You should make Grilled Chicken & Veggies");
                              break;
                              
                           // The user just has chicken pieces
                           case 'n' :
                              System.out.println("Do you have pasta?");
                              char pastaPieces = input.nextLine().toLowerCase().charAt(0);
                              
                              switch (pastaPieces) {
                                 // The user has chicken pieces/pasta
                                 case 'y' :
                                    System.out.println("You should make Chicken Piccata");
                                    break;
                                    
                                 // The user just has chicken pieces
                                 case 'n' :
                                    System.out.println("You should make Fried Chicken");
                                    break;
                                    
                                 // Invalid response to chicken pieces/pasta
                                 default :
                                    System.out.println("Invalid response.");
                                    break;
                              }
                              break;
                              
                           // Invalid response to chicken pieces/vegetables
                           default :
                              System.out.println("Invalid response.");
                              break;
                        }
                        break;
                       
                     // Invalid response to type of chicken 
                     default :
                        System.out.println("Invalid response.");
                        break;
                  }
                  break;
               
               // The user has other meat
               case "other" : case "other meat" : 
                  System.out.println("Do you have eggs?");
                  char eggs = input.nextLine().toLowerCase().charAt(0);
                  
                  switch (eggs) {
                     // The user has other meat/eggs
                     case 'y' :
                        System.out.println("You should make Meat and Eggs");
                        break;
                        
                     // The user only has other meat
                     case 'n' :
                        System.out.println("Do you have vegetables");
                        char vegetablesOther = input.nextLine().toLowerCase().charAt(0);
                        
                        switch (vegetablesOther) {
                           // The user has other meat/vegetables
                           case 'y' :
                              System.out.println("You should make Meat and Veggies");
                              break;
                              
                           // The user just has other meat
                           case 'n' :
                              System.out.println("Do you have pasta?");
                              char pastaOther = input.nextLine().toLowerCase().charAt(0);
                              
                              switch (pastaOther) {
                                 // The user has other meat/pasta
                                 case 'y' :
                                    System.out.println("You should make Meat & Pasta");
                                    break;
                                    
                                 // The user just has other meat
                                 case 'n' :
                                    System.out.println("You should make Just Meat!");
                                    break;
                                    
                                 // Invalid response to other meat/pasta
                                 default :
                                    System.out.println("Invalid response.");
                                    break;
                              }
                              break;
                              
                           // Invalid response to other meat/vegetables
                           default :
                              System.out.println("Invalid response.");
                              break;
                        }
                        break;
                        
                     // Invalid response to other meat/eggs
                     default :
                        System.out.println("Invalid response");
                        break;
                  }
                  break;
               
               // Invalid response to type of meat
               default : 
                  System.out.println("Invalid response.");
                  break;
            }
            break;
         
         // The user does not have meat
         case 'n' : 
            System.out.println("Do you have vegetables?");
            char vegetables = input.nextLine().toLowerCase().charAt(0);
            
            switch (vegetables) {
               // The user has vegetables
               case 'y' :
                  System.out.println("Do you have eggplant?");
                  char eggplant = input.nextLine().toLowerCase().charAt(0);
                  
                  switch (eggplant) {
                     // The user has vegetables/eggplant
                     case 'y' :
                        System.out.println("Do you have tomato?");
                        char tomato = input.nextLine().toLowerCase().charAt(0);
                        
                        switch (tomato) {
                           // The user has vegetables/eggplant/tomato
                           case 'y' :
                              System.out.println("You should make Eggplant Parmesan");
                              break;
                              
                           // The user only has vegetables/eggplant
                           case 'n' :
                              System.out.println("You should make Roasted Eggplant");
                              break;
                              
                           // Invalid response to vegetables/eggplant/tomato
                           default :
                              System.out.println("Invalid response.");
                              break;
                        }
                        break;
                        
                     // The user only has vegetables
                     case 'n' :
                        System.out.println("You should make Vegetable Soup");
                        break;
                     
                     // Invalid response to vegetables/eggplant
                     default :
                        System.out.println("Invalid response.");
                        break;
                  }
                  break;
                  
               // The user does not have vegetables
               case 'n' :
                  System.out.println("Do you have eggs?");
                  char eggs = input.nextLine().toLowerCase().charAt(0);
                  
                  switch (eggs) {
                     // The user has eggs
                     case 'y' :
                        System.out.println("Do you have onions and peppers?");
                        char onionsAndPeppers = input.nextLine().toLowerCase().charAt(0);
                        
                        switch (onionsAndPeppers) {
                           // The user has eggs/onions and peppers
                           case 'y' :
                              System.out.println("You should make a Frittata");
                              break;
                              
                           // The user only has eggs
                           case 'n' :
                              System.out.println("You should make an Omelette");
                              break;
                              
                           // Invalid response to eggs/onions and peppers
                           default :
                              System.out.println("Invalid response.");
                              break;
                        }
                        break;
                        
                     // The user still has nothing
                     case 'n' :
                        System.out.println("Do you have bread?");
                        char bread = input.nextLine().toLowerCase().charAt(0);
                        
                        switch (bread) {
                           // The user has bread
                           case 'y' :
                              System.out.println("You should make a PB & J sandwich");
                              break;
                              
                           // The user literally has nothing
                           case 'n' :
                              System.out.println("Your cupboard is bare!");
                              break;
                              
                           // Invalid response to bread
                           default :
                              System.out.println("Invalid response.");
                              break;
                        }
                        break;
                        
                     // Invalid response to eggs
                     default :
                        System.out.println("Invalid response.");
                        break;
                  }
                  break;
                  
               // Invalid response to vegetables
               default :
                  System.out.println("Invalid response.");
                  break;
            }
            break;
         
         // Invalid response to if the user has meat
         default : 
            System.out.println("Invalid response.");
            break;
      }
   }     
}