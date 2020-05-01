// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// This is the forecaster driver class, which uses the season, temperature, and
// weather objects to create a weather forecast

import java.util.Scanner;

public class Forecaster {
   public static void main(String[] args) {
      // Print welcome message
      System.out.println("Welcome to the Weather Forecaster.");
      
      // Initialize scanner
      Scanner input = new Scanner(System.in);
      
      // Initialize Weather object
      Weather weather = new Weather();
      
      // Loop until the user quits
      boolean quit = false;
      do
      {
         System.out.println();
         System.out.println("1. Set temperature preference");
         System.out.println("2. Set season");
         System.out.println("3. Set weather");
         System.out.println("4. Get forecast");
         System.out.println("5. Print the weather");
         System.out.println("6. Quit");
         System.out.print("Enter choice: ");
         
         int choice = input.nextInt();
         System.out.println();
         
         // Depending on what the user inputs, perform actions
         switch (choice) {
            case 1 :
               // Set Fahrenheit or Celsius
               char scale;
               do 
               {
                  System.out.print("Enter temperature preference (C/F): ");
                  scale = input.next().toUpperCase().charAt(0);
                  
               } while (scale != 'C' && scale != 'F');
               
               weather.getTemp().setScale(scale);
               break;
               
            case 2 :
               // Set the season
               String s;
               do
               {
                  System.out.print("Enter season: ");
                  s = input.next().toLowerCase();
                  
               } while (!s.equals("winter") && !s.equals("spring") && !s.equals("summer") && !s.equals("fall")
                  && !s.equals("autumn"));
               
               weather.getSeason().setSeason(s);
               break;
               
            case 3 :
               // Set the weather conditions
               boolean validTemp = false, validHumid = false, validWind = false;
               double temp;
               int humidity, windspeed;
               
               do
               {
                  // Temperature
                  System.out.print("Enter temperature: ");
                  temp = input.nextInt();
                  double checkTemp = temp;
                  if (weather.getTemp().getScale() == 'C') 
                  {
                     checkTemp = weather.getTemp().convertToF(temp);
                  }
                  
                  if (weather.getTemp().validTemp(checkTemp)) 
                  {
                     validTemp = true;
                  }
                  else
                  {
                     validTemp = false;
                  }
                  
                  // Humidity
                  System.out.print("Enter humidity: ");
                  humidity = input.nextInt();
                  if (humidity >= 0 && humidity <= 100) 
                  {
                     validHumid = true;
                  }
                  else 
                  {
                     validHumid = false;
                  }
                  
                  // Wind Speed
                  System.out.print("Enter windspeed: ");
                  windspeed = input.nextInt();
                  if (windspeed >= 0) 
                  {
                     validWind = true;
                  }
                  else
                  {
                     validWind = false;
                  }
                  
                  // Check to see if either of the options are invalid
                  if (!validTemp || !validHumid || !validWind) 
                  {
                     System.out.println("Invalid entry, try again");
                  }
                  
               } while (!validTemp || !validHumid || !validWind);
               
               weather.getTemp().setTemp(temp);
               weather.setHumidity(humidity);
               weather.setWindSp(windspeed);
               break;
               
            case 4 :
               // Output the forecast
               String season = weather.getSeason().getSeason();
               double t = weather.getTemp().getTemp();
               if (weather.getTemp().getScale() == 'C') 
               {
                  t = weather.getTemp().convertToF(t);
               }
               int h = weather.getHumidity();
               int w = weather.getWindSp();
               
               switch (season) {
                  case "winter" :
                     if (t < 10 && w > 15) 
                     {
                        System.out.println("The forecast is frigid");
                     }
                     else if (t >= 10 && t <= 30 && h >= 80)
                     {
                        System.out.println("The forecast is snow");
                     }
                     else if (t >= 28 && t <= 32 && h >= 60 && h <= 80)
                     {
                        System.out.println("The forecast is icy");
                     }
                     else if (t > 40) 
                     {
                        System.out.println("The forecast is warm");
                     }
                     else 
                     {
                        System.out.println("The forecast is cold");
                     }
                     break;
                  case "spring" :
                     if (t > 65 && t <= 80 && w >= 20 && h >= 80) 
                     {
                        System.out.println("The forecast is stormy");
                     }
                     else if (t < 50) 
                     {
                        System.out.println("The forecast is chilly");
                     }
                     else if (h < 80 && w >= 20) 
                     {
                        System.out.println("The forecast is windy");
                     }
                     else 
                     {
                        System.out.println("The forecast is pleasant");
                     }
                     break;
                  case "summer" :
                     if (t >= 89.6 && w < 10 && h >= 70) 
                     {
                        System.out.println("The forecast is steamy");
                     }
                     else if (t >= 89.6 && w >= 20 && h >= 70) 
                     {
                        System.out.println("The forecast is stormy");
                     }
                     else if (t >= 86 && h < 50) 
                     {
                        System.out.println("The forecast is dry heat");
                     }
                     else if (t < 89.6 && t >= 86 && w >= 20) 
                     {
                        System.out.println("The forecast is hot and windy");
                     }
                     else if (t >= 86) 
                     {
                        System.out.println("The forecast is hot");
                     }
                     else 
                     {
                        System.out.println("The forecast is warm");
                     }
                     break;
                  case "autumn" : 
                  case "fall" :
                     if (t >= 65 && t < 80 && w < 15 && h <= 60) 
                     {
                        System.out.println("The forecast is nice");
                     }
                     else if (h >= 80) 
                     {
                        System.out.println("The forecast is rainy");
                     }
                     else if (t >= 80) 
                     {
                        System.out.println("The forecast is too warm");
                     }
                     else if (t >= 40 && t < 65 && w > 15) 
                     {
                        System.out.println("The forecast is chilly");
                     }
                     else 
                     {
                        System.out.println("The forecast is typical");
                     }
                     break;    
               }
               break;
               
            case 5 :
               // Output the weather
               System.out.println(weather);
               break;
               
            case 6 :
               // Quit
               quit = true;
               break;
               
            default :
               System.out.println("Invalid selection.");
               break;
               
         }         
      } while (!quit);
   }
}