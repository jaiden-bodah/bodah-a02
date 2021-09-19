/*
 *  UCF COP3330 Fall 2021 Assignment 21 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise21.solution21;

/*
Write a program that converts a number from 1 to 12 to the corresponding month.
Prompt for a number and display the corresponding calendar month, with 1 being January and 12 being December.
For any value outside that range, display an appropriate error message.
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object
create a string that correlates the months of the year to numbers
    read in an input for the number of the month
    store the inputs
    check if the number given is one of the months
    correlate the number given to the months in the string
     print out the month
     */

    public String getMonth(int month){
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "Febuary";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";

            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "error";
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Application ntn = new Application();
        System.out.print("Please enter the number of the month: ");
        int month = sc.nextInt();
        String result = ntn.getMonth(month);
        if(month>0 && month<12)
            System.out.print("The name of the month is "+result);
        else
            System.out.print(result+" :please enter correct month number");

    }
}
