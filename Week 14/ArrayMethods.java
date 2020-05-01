/* File ArrayMethods.java
   Fills array with random numbers between 100 and 999 inclusive and finds average, 
   largest, smallest, and reverses array
*/
   
import java.util.Random;

public class ArrayMethods
{
  /**
   * main method invoked when program starts
   * @param args an array of Strings containing possible parameters to main program
   */
   public static void main(String[] args)
   {
   
      int min;        // stores position of minimum value found in array
      int max;        // stores position of maximum value found in array
      double avg;     // stores average of values in array
      
   /* 
      The code below can be used to test your min(), max(), average(), and 
      reverse() methods.  
      
      Use this section of code and it will use the pre-filled testArr[] 
      array. The largest value should be 5.6, the smallest value should be 1.0, 
      and the average should be 3.151. Reversed values should be:
      1.1, 2.1, 3.0, 5.1, 4.01, 5.6, 4.1, 3.3, 2.2, 1.0
      
      When finished, comment out this section of code before submitting to WebCAT.    
   */
   
   /*
   
      double[] testArr = {1.0, 2.2, 3.3, 4.1, 5.6, 4.01, 5.1, 3.0, 2.1, 1.1};
      double[] result;
      System.out.println("Using sample array to test methods:");
   
      min = smallest(testArr);
      max = largest(testArr);
      avg = average(testArr);
   
      result = reverse(testArr);
   
      double value = testArr[min];
      
      System.out.printf("Smallest in testArr is %.3f at position %d.%n", value, min);
      System.out.printf("Largest in testArr is %.3f at position %d.%n", testArr[max], max);
      System.out.printf("The average in testArr is %.3f%n", avg);
      System.out.println("Here is the reversed array: ");
      for (int i = 0; i < result.length; i++)
      {
         System.out.println(result[i]);
      }
      System.out.println();
      */
   
   
   
   
   /*
      The code below will create a 1000 element array and then call all four 
      of the methods on that array.
   */
   
   /*
      final int SIZE = 1000;
      double [] array = new double[SIZE];
      double [] result2;
      System.out.println("This program is now filling the array.");
      array = fillArray(SIZE);
      System.out.println("Average value in array is " + average(array));
      System.out.println();
      
      System.out.println("Testing small and large on real array");
      min = smallest(array);
      max = largest(array);
      avg = average(array);
      System.out.printf("Smallest in array is %.3f at position %d.%n", array[min], min);
      System.out.printf("Largest in array is %.3f at position %d.%n", array[max], max);
      System.out.printf("The average in array is %.3f%n", avg);
      System.out.println("Testing reverse on real array");
      result2 = reverse(array);
      System.out.println("Here is the reversed array: ");
      for (int i = 0; i < result2.length; i++)
      {
         System.out.print(result2[i] + "  ");
         if ((i+1) % 10 == 0)
         {
            System.out.println(); 
         }     
      }
   
      System.out.println();
      
      */
   }
   
   
   /** fillArray
    * fills the array with random whole numbers between 100 and 999
    * @param size size of array to be allocated and filled with values 
    * @return    array of doubles that will be filled with values
    */
   public static double[] fillArray(int size) 
   {  
      // the following statement just returns a blank array;
      // you will need to change this so that you create a
      // new array in this method of the correct size, fill it
      // with random whole numbers between 100 and 999 (the array is
      // an array of doubles, but the values you create should be
      // whole numbers) and then return that array.    
      double[] array = new double[size];
      Random random = new Random();
      for (int i = 0; i < size; i++) {
         array[i] = random.nextInt(899) + 100;
      }
      
      return array;
   }
    
    /** average
     * calculates the average value of the array
     * @param arr array of double values
     * @return    the average of all the values in arr
     */
   public static double average(double[] arr) 
   { 
      // One thing to consider is what if the array has 0 elements in
      // it? The average should be 0.0. This will be tested by WebCAT.
      if (arr.length == 0) 
      {
         return 0.0;
      }
      
      double sum = 0.0;   
      for (double elem : arr) 
      {
         sum += elem;
      }
      
      return (sum / arr.length);
   }
    
    
    /** smallest
     * smallest will return the position of the smallest value
     * @param arr the array of doubles that contain values to process
     * @return    an int as the position of the smallest value in the array   
     */
   public static int smallest(double[] arr) {
      if (arr.length == 0) 
      {
         return 0;
      }
      
      int pos = 0; 
      double smallest = 1000.0;
      for (int i = 0; i < arr.length; i++) 
      {
         if (arr[i] < smallest) 
         {
            smallest = arr[i];
            pos = i;
         }
      }
      
      return pos;
   }
     
        
    /** largest
     * largest will return the position of the largest value
     * @param arr the array of doubles that contain values to process
     * @return    an int as the position of the largest value in the array   
     */
   public static int largest(double[] arr) {
      if (arr.length == 0) 
      {
         return 0;
      }
      
      int pos = 0;
      double largest = 0;
      for (int i = 0; i < arr.length; i++) 
      {
         if (arr[i] > largest) 
         {
            largest = arr[i];
            pos = i;
         }
      }
      
      return pos;
   }
    
    
    /** reverse
     * reverse will return a new array with all of the elements reversed 
     * @param arr the array of doubles that contain values to process
     * @return    an array of doubles, same size as arr, with all the values
     *            reversed from arr   
     */
   public static double[] reverse(double[] arr) {
      double [] reversedArr = new double[arr.length];
      int idx = 0;
      for (int i = arr.length - 1; i > -1; i--) 
      {
         reversedArr[idx++] = arr[i];
      }
      
      return reversedArr;
   }    
}