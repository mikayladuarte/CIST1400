// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// The purpose of this program is to create a custom pedometer
// object

public class Pedometer {
   // Instance Variables
   private int steps;
   private double strideLength;
   private static final int FEET_PER_MILE = 5280;
   private static final double FEET_PER_KM = 3280.84;
   
   // Default Constructor
   public Pedometer() {
      setSteps(0);
      setStrideLength(0);
   }
   
   // Overloaded constructor with only steps
   public Pedometer(int s) {
      setSteps(s);
   }
   
   // Overloaded constructor with both steps and strideLength
   public Pedometer(int s, double sl) {
      setSteps(s);
      setStrideLength(sl);
   }
   
   // Getters
   public int getSteps() {
      return this.steps;
   }
   
   public double getStrideLength() {
      return this.strideLength;
   }
   
   // Setters
   public void setSteps(int s) {
      if (s >= 0) 
      {
         this.steps = s;
      }
   }
   
   public void setStrideLength(double sl) {
      if (sl > 0) 
      {
         this.strideLength = sl;
      }
   
   }
   
   // Facilitator methods
   public double miles() {
      return this.steps * this.strideLength / this.FEET_PER_MILE;
   }
   
   public double kilometers() {
      return this.steps * this.strideLength / this.FEET_PER_KM;
   }
   
   public void reset() {
      setSteps(0);
   }
   
   public void step() {
      this.steps++;
   }
   
   public void addSteps(int moreSteps) {
      if (moreSteps > 0) 
      {
         this.steps += moreSteps;
      }
   }
   
   public double caloriesBurned(double weight) {
      double burnRate;
      if (weight <= 150) 
      {
         burnRate = 0.05;
      }
      else if (weight <= 200)
      {
         burnRate = 0.10;
      }
      else if (weight <= 250) 
      {
         burnRate = 0.17;
      }
      else if (weight <= 300) 
      {
         burnRate = 0.23;
      }
      else if (weight <= 350) 
      {
         burnRate = 0.31;
      }
      else 
      {
         burnRate = 0.51;
      }
      
      return burnRate * this.steps;
   }
   
   // Override methods
   public String toString() {
      return this.steps + " steps / " + this.strideLength + " stride length";
   }
   
   public boolean equals(Pedometer other) {
      return (other.steps == this.steps) && (Math.abs(other.strideLength - this.strideLength) <= 0.001);
   }
}