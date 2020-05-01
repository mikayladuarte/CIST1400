// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// This is the season class, which will hold our season
// object for the Forecaster class

public class Season {
   // Instance variables
   private String season;
   
   // Constructors
   public Season() {
      this.season = "winter";
   }
   
   // Getter
   public String getSeason() {
      return this.season;
   }
   
   // Setter
   public void setSeason(String s) {
      switch (s.toLowerCase()) {
         case "winter" : case "spring" : case "summer" : case "autumn" : case "fall" :
            this.season = s.toLowerCase();
            break;
      }
   }
   
   // toString
   @Override
   public String toString() {
      return this.season;
   }
   
   // equals
   @Override
   public boolean equals(Object other) {
      boolean result = false;
      if (other instanceof Season)
      {
         Season o = (Season) other;
         switch (this.season) {
            case "autumn" : case "fall" :
               if (o.getSeason().equals("autumn") || o.getSeason().equals("fall")) 
               {
                  result = true;
               }
               break;
               
            default :
               if (this.season.equals(o.getSeason())) 
               {
                  result = true;
               }
               break;        
         }     
      }
      return result;
   }
}