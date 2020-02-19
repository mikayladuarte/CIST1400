// Name : Mikayla Duarte
// Class : CIST 1400-002
// Colleagues : None
// Resources : None

// The purpose of this program is to do some temperature calculations

public class Temperature
{
   public static void main(String[] args)
   {
      // declare variables
      double celsiusValue;
      double fahrenheitValue;
      double kelvinValue;
      
      // declare constant values
      final double celsiusToFahrenheit = 9.0 / 5.0;
      final double fahrenheitToKelvin = 5.0 / 9.0;
      final int fahrenheitBase = 32;
      final double kelvinBase = 273.15;
      
      // set up initial value
      celsiusValue = 24.33;
      
      // calculate fahrenheit equivalent
      fahrenheitValue = celsiusValue * celsiusToFahrenheit + fahrenheitBase;
      
      // perform output
      System.out.print(celsiusValue + " degrees Celsius is ");
      System.out.println(fahrenheitValue + " degrees Fahrenheit.");
      
      // calculate kelvin equivalent
      kelvinValue = (fahrenheitValue - fahrenheitBase) * fahrenheitToKelvin + kelvinBase;
      System.out.println("This is " + kelvinValue + " degreens Kelvin.");
   }
}