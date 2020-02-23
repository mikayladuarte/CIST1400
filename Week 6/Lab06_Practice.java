import java.util.Scanner;
public class Lab06_Practice {
   public static void  main (  String args [ ]) {
      // In this lab you will predict the output of each of the following examples BEFORE
      // you run the code. After your predictions have been checked off by the GA, you should 
      // then load the code into jGRASP and fix any errors that you may discover 
      // and then also determine where you were incorrect in your predictions and why.
      
      Scanner in = new Scanner (System.in);
      
      // EXAMPLE 1
      System.out.println("******************  EXAMPLE 1 *****************" );
      int x = 4, y = 9;
      int a = 99, b = -22;
   
      if (x > y)
         System.out.println("x > y");
      if (x < y)
         System.out.println("x < y");
      if (x >= y)
         System.out.println("x >= y");
      if (a <= 10023)
         System.out.println("a <= 10023");
      if (b == y)
         System.out.println("b == y");
      if (b == 5)
         System.out.println("b == 5");
      if (x != 4)
         System.out.println("x != 4");
      System.out.println();
      
      // EXAMPLE 2
      System.out.println("******************  EXAMPLE 2 *****************" );
      boolean even = false;
      x = 6;
   
      if (x % 2 == 0)
         even = true;
   
      if (even)
         System.out.println("x is even.");
      if (even == true)
         System.out.println("x is even.");
      if (even == false)
         System.out.println("x is not even.");
   
      if (true)
         System.out.println("This statement WILL output.");
      if (false)
         System.out.println("This statement will NOT output.");
      System.out.println();
      
      // EXAMPLE 3
      System.out.println("******************  EXAMPLE 3 *****************" );
      System.out.print("Select an option:\n" +
                "  1. Have Time\n  2. Work Hard\n" +
                "  3. Socialize\n\n> ");
   
      int choice = in.nextInt();       // user enters 2
   
      if (choice == 1)
         System.out.println("Here's time!");
      else if (choice == 2)
         System.out.println("Keep it up!");
      else if (choice == 3)
         System.out.println("Nice weather we're having!");
      else
         System.out.println("Well, you can't do all three.");
      System.out.println();
      
      
      // EXAMPLE 4
      System.out.println("******************  EXAMPLE 4 *****************" );
      int grade = 90;
      if (grade >= 90)
         System.out.println("You got an A!");
      else if (grade >= 80)
         System.out.println("You got a B!");
      else if (grade >= 70)
         System.out.println("You got a C!");
      System.out.println();
   
      // EXAMPLE 5
      System.out.println("******************  EXAMPLE 5 *****************" );
      a = 4;
   
      if ( a == 4 ) {
         System.out.println ( "a is equal to 4!" );
      }
      System.out.println();
   
      // EXAMPLE 6
      System.out.println("********************  EXAMPLE 6 *****************" );
      b = 483;
   
      if ( b == 4 ) {
         System.out.println ( "b is equal to 4!" );
      }
      System.out.println();
   
      // EXAMPLE 7
      System.out.println("*********************  EXAMPLE 7 *****************" );
      a = 483;
   
      if ( a == 4 ) {
         System.out.println ( "a is equal to 4!" );
         System.out.println ( "That's right ?? a is 4!" );
      }
      else if ( a == 483 ) {
         System.out.println ( "a is equal to 483!" );
         System.out.println ( "That's right ?? a is 483!" );
      }
      System.out.println(); 
   
      // EXAMPLE 8
      System.out.println("*********************  EXAMPLE 8 *****************" );
      b = 483;
   
      if ( b == 4 )
      {
         System.out.println ( "b is equal to 4!" );
         System.out.println ( "That's right ?? b is 4!" );
      }
      else if ( b == 483 )
      {
         System.out.println ( "b is equal to 483!" );
      }
      System.out.println ( "That's right ?? b is 483!" );
      System.out.println();   
   
      // EXAMPLE 9 
      System.out.println("*********************  EXAMPLE 9 *****************" );
      int number1, number2;
      System.out.print ( "Enter first integer: ");
      number1 = in.nextInt();
      System.out.print ( "Enter second integer: ");
      number2 = in.nextInt();
   
      if (number1 == number2)
         System.out.println( number1 + " == " + number2 );
      if (number1 != number2)
         System.out.println( number1 + " != " + number2 );
      if (number1 < number2)
         System.out.println( number1 + " < " + number2 );
      if (number1 > number2)
         System.out.println( number1 + " > " + number2 );
      if (number1 <= number2)
         System.out.println( number1 + " <= " + number2 );
      if (number1 >= number2)
         System.out.println( number1 + " >= " + number2 );
      System.out.println();    
  
      // EXAMPLE 10
      System.out.println("*********************  EXAMPLE 10 ****************" );
      grade = 65;
      String message;
      if ( grade >= 60 )  {
         message = "You passed";
      }
      else
         message = "You failed";
      System.out.println( message );
      System.out.println();
   
   }
}