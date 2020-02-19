// Name : Mikayla Duarte
// Class : CIST1400-004
// Colleagues : None
// Resources : None

// The purpose of this program is to determine amount of fence needed
public class Fence
{
    public static void main(String[] args)
    {
        // declare variables
        
        // ***** gate required every how many feet and this value DOES NOT CHANGE
        final int gate_distance = 150;
        
        
        // ***** declare variables for length, width, and house width;
        int length_yard;
        int width_yard;
        int width_house;
         
         
        // ***** declare total number of feet needed and total number of yards needed;
        int perimeter;
        
         
        // ***** declare variable for amount of fence needed
        double amount_of_fence_in_yards;
        
         
        // ***** fill in values for the yard's dimensions
        length_yard = 100;
        width_yard = 120;
        
        
        // ***** Compute the total perimeter (in feet) to be fenced
        perimeter = 2 * length_yard + 2 * width_yard;      
        

        // ***** Compute the amount of fence needed in yards
        width_house = 75;
        amount_of_fence_in_yards = (perimeter - width_house) / 3.0;
        
                  
        // ***** Print the dimensions of the yard and house and the amount of fence needed
        System.out.println("A yard that is " + length_yard + " feet long and " + width_yard + " feet wide with a house that is " + width_house + " feet wide");
        System.out.println("has " + perimeter + " feet to cover and requires " + amount_of_fence_in_yards + " yards of fence.");
       
        
        // ******* Print the number of gates required.
        int number_of_gates = (perimeter - width_house) / gate_distance;
        System.out.println("You will need to have " + number_of_gates + " gates.");

        
    }
}

