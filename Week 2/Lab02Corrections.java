// Name: Mikayla Duarte
// Class: CIST1400-002
// Colleagues: N/A
// Resources: N/A

public class Lab02Corrections
{
   public static void main(String[] args)
   {

      /* PART 1 *****************************************************************************
      
         Use a System.out.print() or System.out.println() statement to output
         the phrase "Hello World" (quotes not needed in output). Make sure the output
         is on a line by itself. Add the code then compile and test it locally to make
         sure it runs correctly.
      */
      System.out.println("Hello World");

            
      /* PART 2 *****************************************************************************
      
         For this part, first uncomment the line below and try to compile the program 
         and see what happens.  When you have read through the results that come back from
         the compiler, fix the code below to enable the program to successfully compile.
         Make the minimum amount of changes necessary.
      */

      System.out.println("This line initially won't compile!");         
      
      
      /* PART 3 *****************************************************************************
      
         Use a System.out.println()  statement to output your favorite number.
      */
      
       System.out.println(5);     
            
      
      /* PART 4 *****************************************************************************
      
         This section should use a System.out.println() statement to print the
         current year.

         First, uncomment the lines and compile and run this section.  
         Notice that the compiler doesn't produce any warnings or error messages, 
         but that running the program doesn't generate the correct output. 

         Fix the problem so that the actual year prints using the variable year.
         
         Additionally, change the variable's value so it is the current year.
      */

      int year = 2020;
      System.out.println("Here's the year: " + year);


      /* PART 5 *****************************************************************************
      
         Now decare another variable to store the current day of the month.
         Then use both variables to output today's date to the screen in three different formats.  
         Print the date in the following three formats on three separate lines:
         
         month / day / year
         Month (as a word) day, year
         day - month - year
         
         So, if today was the first of January, 2112, you would output the text 

            1/1/2112
            January 1, 2112 
            1 - 1 - 2112  
      */
      int month = 1;
      int day = 22;
      String month_str = "January";
      
      System.out.printf("%d/%d/%d\n", month, day, year);
      System.out.printf("%s %d, %d\n", month_str, day, year);
      System.out.printf("%d - %d - %d\n", day, month, year);
      
      
      /* PART 6 *****************************************************************************

         The last thing you have to do is to declare a constant numeric value. 
         
         It can be any data type you wish. Then you need to give it a value.
         
         Lastly you should print the constant you declared along with a description
         of what it represents.
      */
      
      final int number = 10;
      System.out.printf("%d is the exact number of oreos you should eat every night", number);     
      
      
   }
}
