/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise19.solution19;

/*
Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds.
The program should prompt the user for weight and height.
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object
    read in an input to determine if it is either fahrenheit to celsius or vice versa
    read in input for either fahrenheit or celsius
    store the inputs
    calculate the temperature in the other system
     print out what the new temperature
     */

    public static void main(String arg[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in Pounds : ");
        float weight = scanner.nextFloat();

        System.out.println("Enter Height in inches : ");
        float height = scanner.nextFloat();

        float bmi = (weight / (height * height)) * 703;

        //print the result
        if (bmi <= 18.4) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are underweight. You should see your doctor.");
        }

        else if (bmi >= 25.1) {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are overweight. You should see your doctor.");
        }
        else {
            System.out.println("Your BMI is: " + bmi);
            System.out.println("You are within the ideal weight range.");

        }
    }
    }
