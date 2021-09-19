/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise12.solution12;

/*
Create a program that computes simple interest.
Prompt for the principal amount, the rate as a percentage, and the time,
and display the amount accrued (principal + interest).
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object
    read in the principal, interest, and time
    store the inputs
     uses the inputs to calculate the amount of simple interest
     round to the nearest cent
     add together the principle and interest
     print out the values of the equations
     */

        public static void main(String args[])
        {
            float p, r, t, sinterest;
            float total = 0;

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter the Principal : ");
            p = scan.nextFloat();

            System.out.print("Enter the Rate of interest : ");
            r = scan.nextFloat();

            System.out.print("Enter the Number of years : ");
            t = scan.nextFloat();

            scan.close();

            sinterest = (p * r * t) / 100;
            float rounded = (float) (Math.ceil(sinterest *100)/100.00);
            total = (p + rounded);

            System.out.print("After " +t + " years at " +r + "% the investment will be worth $" +total);
        }

}