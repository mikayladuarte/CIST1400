// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// This is the weather class, which will hold our weather
// object for the Forecaster class

public class Weather {
   // Instance variables
   private Temperature temp;
   private int humidity;
   private int windSpeed;
   private Season season;
   
   // Constructors
   public Weather() {
      this.temp = new Temperature();
      this.humidity = 50;
      this.windSpeed = 0;
      this.season = new Season();
   }
   
   public Weather(double t, char sc, String whichSeason) {
      this.temp = new Temperature(t, sc);
      this.humidity = 50;
      this.windSpeed = 0; 
      this.season = new Season();
      this.season.setSeason(whichSeason);
   }
   
   // Getters
   public Temperature getTemp() {
      return this.temp;
   }
   
   public int getHumidity() {
      return this.humidity;
   }
   
   public int getWindSp() {
      return this.windSpeed;
   }
   
   public Season getSeason() {
      return this.season;
   }
   
   // Setters
   public void setTemperature(Temperature t) {
      this.temp = t;
   }
   
   public void setHumidity(int h) {
      if (h >= 0 && h <= 100)
      {
         this.humidity = h;
      }
   }
   
   public void setWindSp(int sp) {
      if (sp >= 0) 
      {
         this.windSpeed = sp;
      }
   }
   
   public void setSeason(Season s) {
      if (s != null) 
      {
         this.season = s;
      }
   }
   
   // toString
   @Override
   public String toString() {
      return "The weather is currently " + this.temp + " with " + this.humidity + "% humidity and a " 
         + this.windSpeed + " mph wind";
   }
   
   // equals
   @Override
   public boolean equals(Object other) {
      if (other instanceof Weather) 
      { 
         Weather o = (Weather) other;
         if (getTemp().equals(o.getTemp()) && getHumidity() == o.getHumidity())
         {
            return true;
         }
      }
      return false;
   }
}