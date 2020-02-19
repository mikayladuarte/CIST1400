// Name: Mikayla Duarte
// Class: CIST1400-004
// Colleagues: N/A
// Resources: N/A

import java.util.Scanner;

public class SimpleInput {
   public static void main(String[] args) {
   
      Scanner input = new Scanner(System.in);
      
      System.out.println("What is your name?");
      String name = input.nextLine();     
      System.out.println("Hello " + name + "\n");
      
      System.out.println("What year were you born?");
      int year = input.nextInt();
      System.out.println(year);
      int age = 2019 - year;
      System.out.println(age);     
      final double lifeExpectancy = 78.7;
      double percentLifeLived = age / lifeExpectancy * 100;
      System.out.println(percentLifeLived + "\n");
      
      System.out.println("What is the value of Pi?");
      double piEstimation = input.nextDouble();
      System.out.println(piEstimation);
      double error = 22.0 / 7.0 - piEstimation;
      System.out.println(error);
   }
}