/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package exercise11.solution11;

/*
Write a program that converts currency.
Specifically, convert euros to U.S. dollars.
Prompt for the amount of money in euros you have, and prompt for the current exchange rate of the euro.
Print out the new amount in U.S. dollars.
 */

import java.util.Scanner;

public class Application {

/*
create a scanner object
    read in the amount of Euros and the exchange rate
    store the inputs
     uses the inputs to calculate the amount of U.S. Dollars
     round to the nearest cent
     print out the values of the equations
     */

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            double result = 0.0;

            System.out.println("Welcome to the Currency Converter");
            System.out.println("----------------------------------");
            System.out.println("How many Euros are you exchanging?");

            double euros = sc.nextDouble();

            System.out.println("What is the exchange rate?");

            double exchangeRate = sc.nextDouble();

            double dollars = currencyConverter(euros, exchangeRate,result);
            double rounded = Math.ceil(dollars *100)/100.00;

            System.out.println(euros + " Euros at an Exchange rate of " + exchangeRate + " is ");
            System.out.println(rounded + " U.S Dollars ");

            sc.close();
        }

        private static double currencyConverter(double euros, double exchangeRate,double result) {
            return result = euros * exchangeRate;

        }

    }
