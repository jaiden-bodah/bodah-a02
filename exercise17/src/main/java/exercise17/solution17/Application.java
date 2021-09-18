/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */

package exercise17.solution17;

/*
Create a program that prompts for your weight, gender, total alcohol consumed (in ounces),
and the amount of time since your last drink.
Calculate your blood alcohol content (BAC) using this formula
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object
    read in the age of the user
    store the inputs
    determine if the user is over or under 16
     print if they are old enough to drive, or not
     */

    public static void main(String[] args)
    {
        Scanner scr=new Scanner(System.in);

        int A,choice,W,H;
        double BAC,r;
        System.out.print("Enter a 1 is you are male or a 2 if you are female: ");
        choice=scr.nextInt();
        if(choice==1)
            r=0.73;
        else
            r=0.66;
        System.out.print("How many ounces of alcohol did you have? ");
        A=scr.nextInt();
        System.out.print("What is your weight, in pounds? ");
        W=scr.nextInt();
        System.out.print("How many hours has it been since your last drink? ");
        H=scr.nextInt();

        BAC=A*5.14/W*r-0.015*H;
        System.out.println();

        System.out.println("Your BAC is "+BAC);

        if(BAC<=0.08)
            System.out.println("It is legal for you to drive");
        else
            System.out.println("It is not legal for you to drive");



    }
}
