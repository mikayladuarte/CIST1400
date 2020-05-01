// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// The purpose of this program is to create a custom die
// object

import java.util.Random;

public class Die {
   // Instance variables
   private static final int MIN_FACES = 4;
   private int numFaces;
   private int faceValue;
   
   // Constructors
   public Die() {
      setNumFaces(6);
      setFaceValue(1);
   }
   
   public Die(int faces) {
      setNumFaces(faces);
      setFaceValue(1);
   }
   
   // Getters
   public int getNumFaces() {
      return this.numFaces;
   }
   
   public int getFaceValue() {
      return this.faceValue;
   }
   
   // Setters
   public void setNumFaces(int nfaces) {
      if (nfaces >= this.MIN_FACES) 
      {
         this.numFaces = nfaces;
         
      }
      else 
      {
         this.numFaces = 6;
      }
      
      if (this.faceValue > this.numFaces)
      {
         setFaceValue(1);
      }
   }
   
   public void setFaceValue(int fvalue) {
      if (fvalue >= 1 && fvalue <= this.numFaces) 
      {
         this.faceValue = fvalue;
      }
   }
   
   // Facilitator methods
   public int roll() {
      Random random = new Random();
      int newFaceValue = random.nextInt(this.numFaces) + 1;
      setFaceValue(newFaceValue);
      return newFaceValue;
   }
   
   // Override methods
   @Override
   public String toString() {
      return "Die has " + this.numFaces + " sides and current value is " + this.faceValue;
   }
   
   @Override
   public boolean equals(Object other) {
      boolean result = false;
      
      if (other instanceof Die) 
      {
         Die o = (Die) other;
         return (this.numFaces == o.numFaces && this.faceValue == o.faceValue);
      }
      else
      {
         return false;
      }
   }
}