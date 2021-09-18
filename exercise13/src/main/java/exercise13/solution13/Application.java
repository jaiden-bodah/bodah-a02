/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package exercise13.solution13;

/*
Write a program to compute the value of an investment compounded over time.
The program should ask for the starting amount, the number of years to invest, the interest rate,
and the number of periods per year to compound.
 */

import java.util.Scanner;

public class Application {

      /*
create a scanner object
    read in the principal, annual rate of interest, number of years, and number of times a year interest is calculated
    store the inputs
     uses the inputs to calculate the amount of simple interest
     calculate the amount at the end of investment
     print out the entered and calculated data
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int principalAmount = input.nextInt();

        System.out.print("What is the rate? ");
        double rate = input.nextDouble();

        System.out.print("What is the number of years? ");
        int year = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double A = principalAmount*Math.pow(1+((rate*0.01)/n),n*year);

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",
                principalAmount, rate, year, n, A);

        input.close();
    }
}
