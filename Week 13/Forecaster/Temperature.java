// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// This is the temperature class, which will hold our temperature
// object for the Forecaster class

public class Temperature {
   // Instance variables
   private double degrees;
   private char scale;
   
   // Constructors
   public Temperature() {
      this.degrees = 0.0;
      this.scale = 'C';
   }
   
   public Temperature(double temp, char sc) {
      // set validates the temp/scale at the same time
      // so set them to default values first, and then
      // re-set them if they're valid
      
      this.degrees = 0.0;
      this.scale = 'C';
      set(temp, sc);
   }
   
   // Getters
   public double getTemp() {
      return this.degrees;
   }
   
   public char getScale() {
      return this.scale;
   }
   
   // Setters
   public void setTemp(double temp) {
      set(temp, this.scale);
   }
   
   public void setScale(char sc) {
      // Set scale is more complex because you have to convert
      // the current temp if we're changing the scale
      switch (sc) {
         case 'c' : case 'C' :
            sc = 'C';
            if (sc != this.scale) 
            {
               this.degrees = convertToC(this.degrees);
            }
            this.scale = sc;
            break;
         case 'f' : case 'F' :
            sc = 'F';
            if (sc != this.scale)
            {
               this.degrees = convertToF(this.degrees);
            }
            this.scale = sc;
            break;
      }
   }
   
   public void set(double temp, char sc) {
      double checkTemp = temp;
      if (validScale(sc)) 
      {
         if (sc == 'c' || sc == 'C') 
         {
            checkTemp = convertToF(temp);
         }
         
         if (validTemp(checkTemp))
         {
            switch (sc) {
               case 'c' : case 'C' :
                  this.scale = 'C';
                  break;
               case 'f' : case 'F' :
                  this.scale = 'F';
                  break;
            }
            this.degrees = temp;
         }
      }
   }
   
   // Convert to Fahrenheit
   public double convertToF(double temp) {
      return temp * (9.0 / 5.0) + 32;
   }
   
   // Convert to Celsius
   public double convertToC(double temp) {
      return (temp - 32) * (5.0 / 9.0);
   }
   
   // Validate Temperature
   public boolean validTemp(double temp) {
      return (temp > -51 && temp < 151);
   }
   
   // Validate Scale
   public boolean validScale(char sc) {
      switch (sc) {
         case 'c' : case 'C' : case 'f' : case 'F' :
            return true;
         default :
            return false;
      }
   }
   
   // toString
   @Override
   public String toString() {
      return this.degrees + " degrees " + this.scale;
   }
   
   // equals
   @Override
   public boolean equals(Object other) {
      if (other instanceof Temperature)
      {
         Temperature o = (Temperature) other;
         if (this.scale == o.getScale() && this.degrees == o.getTemp()) 
         {
            return true;
         }
         else if (this.scale != o.getScale() && this.scale == 'F') 
         {
            double checkTemp = convertToF(o.getTemp());
            if (Math.abs(this.degrees - checkTemp) <= 0.001)
            {
               return true;
            }
         }
         else if (this.scale != o.getScale() && this.scale == 'C') 
         {
            double checkTemp = convertToF(this.degrees);
            if (Math.abs(checkTemp - o.getTemp()) <= 0.001)
            {
               return true;
            }
         }
      }
      
      return false;
   }
}