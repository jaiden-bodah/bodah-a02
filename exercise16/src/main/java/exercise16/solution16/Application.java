/*
 *  UCF COP3330 Fall 2021 Assignment 16 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise16.solution16;

/*
Write a program that asks the user for their age and compare it to the legal driving age of sixteen.
If the user is sixteen or older, then the program should display "You are old enough to legally drive."
If the user is under sixteen, the program should display "You are not old enough to legally drive."
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

    public static void main(String[] args) {

        int age;
        Scanner sc= new Scanner(System.in); //Create Object of Scanner to read i/p from keyboard
        System.out.print("What is your age? ");  //print the prompt using System.out.print()
        age=sc.nextInt();     //read age from user
        if(age>=16)           //check if age>=16, if true, then print prompt "old enough"
            System.out.println("You are old enough to legally drive");
        else               //if false, i.e. if age<16, print "not old enough"
            System.out.println("You are not old enough to legally drive");


    }

}
