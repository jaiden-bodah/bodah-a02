/*
 *  UCF COP3330 Fall 2021 Assignment 07 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise07.solution07;

/*
Create a program that calculates the area of a room.
Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object
    read in the inputs for length and width
    store the inputs
    calculate the square feet
    use that to calculate the square meters
     print out the results of the calculations
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        float length = input.nextFloat();

        System.out.print("What is the width of the room in feet? ");
        float width = input.nextFloat();

        float x = (float) 0.09290304;
        float f2 = (length * width);
        float m2 = (f2 * x);

        System.out.println("You entered dimensions of " +length +" feet by " +width +" feet.");
        System.out.println("The area is");
        System.out.println(f2 +" square feet");
        System.out.println(m2 +" square meters");
    }
}