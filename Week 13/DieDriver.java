// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// The purpose of this program is to serve as a driver
// for the Die class

public class DieDriver {
   public static void main(String[] args) {
      // Test default constructor and getters
      // Number of faces: 6, Face value: 1
      System.out.println("Die a");
      Die a = new Die();
      System.out.println("Number of faces: " + a.getNumFaces() + ", Face value: " + a.getFaceValue());
      
      // Test overloaded constructor and getters
      // Number of faces: 20, Face value: 1
      System.out.println("Die b");
      Die b = new Die(20);
      System.out.println("Number of faces: " + b.getNumFaces() + ", Face value: " + b.getFaceValue());
      
      // Test setting an incorrect face value
      // Number of faces: 6, Face value: 1
      System.out.println("Die c");
      Die c = new Die(3);
      System.out.println("Number of faces: " + c.getNumFaces() + ", Face value: " + c.getFaceValue());
      
      // Test setters
      System.out.println("Testing setters on die a");
      // Face value: 11
      b.setFaceValue(11);
      System.out.println("Face value: " + b.getFaceValue());
      b.setNumFaces(10);
      // Number of faces: 10
      System.out.println("Number of faces: " + b.getNumFaces());
      // Face value: 1
      System.out.println("Face value: " + b.getFaceValue());
      
      // Test roll
      // Die c rolled a (number between 1 and 6)
      System.out.println("Testing roll on die c");
      System.out.println("Die c rolled a " + c.roll());
      
      // Test toString()
      // Die has 20 sides and current value is 1
      System.out.println(b.toString());
      
      // Test equals()
      Die d = new Die();
      Die e = new Die();
      // Die a is equal to die d: false
      System.out.println("Die a is equal to die d: " + a.equals(d));
      // Die d is equal to die e: true
      System.out.println("Die d is equal to die e: " + d.equals(e));
      
   }
}