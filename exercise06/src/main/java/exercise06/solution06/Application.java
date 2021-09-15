package exercise06.solution06;

/*
Create a program that determines how many years you have left until retirement and the year you can retire.
It should prompt for your current age and the age you want to retire and display the output as shown in the example that follows.
 */

import java.util.Calendar;
import java.util.Scanner;

public class Application {

       /*
create a scanner object to read inputs
prompt for the current age and retirement age the user
store the inputs of the user
compute the years till retirement and the year they should retire
print out years left and retirement year
     */

        public static void main (String[] args)
        {
            Scanner in = new Scanner(System.in);

            int current_year = Calendar.getInstance().get(Calendar.YEAR);

            System.out.print("What is your current age? ");
            int age = in.nextInt();

            System.out.print("At what age would you like to retire? ");
            int retire_age = in.nextInt();

            int years_left = retire_age - age;
            System.out.println("You have " + years_left + " years left until you can retire.");

            int retire_year = current_year + years_left;
            System.out.println("It's " + current_year +", so you can retire in " + retire_year + ".");

        }
}
