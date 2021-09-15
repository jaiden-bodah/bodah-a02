/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package exercise09.solution09;

/*
Calculate gallons of paint needed to paint the ceiling of a room.
Prompt for the length and width, and assume one gallon covers 350 square feet.
Display the number of gallons needed to paint the ceiling as a whole number.
 */

import java.util.Scanner;

public class Application {

           /*
create a scanner object
    define how much square feet a gallon is
    take the length and width measurements from the user
    store the inputs
     uses the inputs to calculate the total square footage and use that to calculate the amount of gallons needed
     print the amount of gallons needed and amount of total square feet
     */

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double sqFeetPerGallon = 350;

        System.out.print("Enter length: ");
        double length = sc.nextDouble();

        System.out.print("Enter width: ");
        double width = sc.nextDouble();

        double totalSq = length*width;
        int gallon = (int)Math.ceil(totalSq/sqFeetPerGallon);

        System.out.println("You will need to purchase "+gallon+" of paint to cover "+totalSq+" squre feet");
    }

}
