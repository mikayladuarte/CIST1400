// This is a test/driver program for the Pedometer class.
// It can be used to test your Pedometer class. You should uncomment each line or set of
// lines of code below to test the methods specified in the comments.
// See assignment for example of how output should look if all of your Pedometer methods
// are implemented correctly.

public class DrivePedometer
{
   public static void main(String[] args)
   {
   
   //       Uncomment out the line below when you have implemented default constructor
          Pedometer mine = new Pedometer();
   
   
   //       Comment out lines below when you have implemented specific constructors
           Pedometer yours = new Pedometer(500);
           Pedometer theirs = new Pedometer(10002, 5.12);
   
   
   //       Uncomment out the lines below when setStrideLength() has been implemented     
           mine.setStrideLength(3.5);
           yours.setStrideLength(2.5);
   
   
   //       Uncomment the lines below when getStrideLength(), getSteps(), and setStrideLength()
   //       have been implemented      
           Pedometer abracadabra = new Pedometer(-5);
           System.out.println(abracadabra.getSteps() + " steps and stride of " 
              + abracadabra.getStrideLength() + " feet.");
          abracadabra.setStrideLength(0);
           System.out.println(abracadabra.getSteps() + " steps and stride of " 
              + abracadabra.getStrideLength() + " feet.");
           abracadabra.setSteps(-500);
           System.out.println(abracadabra.getSteps() + " steps and stride of " 
              + abracadabra.getStrideLength() + " feet.");
           abracadabra.setSteps(0);
           System.out.println(abracadabra.getSteps() + " steps and stride of " 
              + abracadabra.getStrideLength() + " feet.");
   
   
   //       Uncomment out the for loop below when step() has been implemented      
           for (int i = 0; i < 10000; i++)
           {
              mine.step();
           }
   
      
   //       Uncomment out the line below when addSteps() has been implemented
           yours.addSteps(5000);
   
   
   //       Uncomment out the lines below when caloriesBurned() has been implemented      
           System.out.println("I have burned " + mine.caloriesBurned(150) + " calories.");
           System.out.println("You have burned " + yours.caloriesBurned(200) + " calories.");
           System.out.println("They have burned " + theirs.caloriesBurned(250) + " calories.");
   
   
   //       Uncomment the line below when reset() has been implemented      
           yours.reset();
   
   
   //       Uncomment the line below when setSteps() has been implemented
           yours.setSteps(11290);
   
   
   //       Uncomment the lines below when miles() and kilometers() have been implemented      
           System.out.println("I have walked " + mine.miles() + " miles.");
           System.out.println("You have walked " + yours.kilometers() + " kilometers.");
   
   //       Uncomment the lines below when toString() has been implemented   
           Pedometer foo = new Pedometer(6, 1.365);
           System.out.println("The toString() method should generate: 6 steps / 1.365 stride length");
           System.out.println(foo);
   
   
   //       Uncomment the rest of the code when equals() has been implemented      
           Pedometer abc = new Pedometer(7712, 1.122);
           Pedometer def = new Pedometer(7712, 1.122);
           Pedometer ghi = new Pedometer(7712, 1.110);
           Pedometer jkl = new Pedometer(7711, 1.122);
        
           if (abc.equals(def))
           {
              System.out.println("Pedometer abc is equal to Pedometer def! This is correct!");
           }
           else
           {
              System.out.println("Check your equals() method. Pedometer abc is equal to Pedometer def, "
                 + "but your equals() method is returning false instead.");
                 
           }
           
           if (abc.equals(ghi))
           {
              System.out.println("Check your equals() method. Pedometer abc is NOT EQUAL to Pedometer ghi, "
                 + "but your equals() method is returning true instead.");
           }
           else
           {
              System.out.println("Pedometer abc is not equal to Pedometer ghi! This is correct!");
                 
           }
           if (abc.equals(jkl))
           {
              System.out.println("Check your equals() method. Pedometer abc is NOT EQUAL to Pedometer jkl, "
                 + "but your equals() method is returning true instead.");
           }
           else
           {
              System.out.println("Pedometer abc is not equal to Pedometer jkl! This is correct!");
                 
           }
   
   
   }
}
