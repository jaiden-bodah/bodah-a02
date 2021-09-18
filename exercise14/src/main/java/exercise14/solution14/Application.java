/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package exercise14.solution14;

/*
Write a simple program to compute the tax on an order amount.
The program should prompt for the order amount and the state.
If the state is WI,then the order must be charged 5.5% tax.
The program should display the subtotal, tax,
and total for Wisconsin residents but display just the total for non-residents.
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object
    read in the order amount and the state
    store the inputs
    determine the tax depending on the state
     display the subtotal
     calculate the tax amount
     print tax
     calculate total amount
     print the total amount
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("What is the order amount? ");
        double orderAmount = input.nextDouble();

        System.out.print("What is the state? ");
        String state = input.next();

        double tax;
        if(state.equalsIgnoreCase("WI")) {
            System.out.printf("The subtotal is $%.2f\n", orderAmount);

            tax = 5.5/10;
            System.out.printf("The tax is $%.2f\n", tax);
        } else {
            tax = 0;
        }

        double total = orderAmount + tax;

        System.out.printf("The total is $%.2f\n", total);

        input.close();
    }
}
