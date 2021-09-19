/*
 *  UCF COP3330 Fall 2021 Assignment 07 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise22.solution22;

/*
Write a program that asks for three numbers.
Check first to see that all numbers are different.
If they’re not different, then exit the program.
Otherwise, display the largest number of the three.
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object
    prompt for the input of three numbers
    store the inputs
    determine if the largest number by comparing them against each other
     print the largest number
     */

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int x = in.nextInt();

        System.out.print("Input the second number: ");
        int y = in.nextInt();

        System.out.print("Input the third number : ");
        int z = in.nextInt();

        if (x>y) {
            if (x>z)
            System.out.print("The largest number is: " + x);
            else
                System.out.print("The largest number is: " +z);
        }
        else if (y>z)
        System.out.print("The largest number is: " +y);

        else
        System.out.print("The largest number is: " +z);
    }
}