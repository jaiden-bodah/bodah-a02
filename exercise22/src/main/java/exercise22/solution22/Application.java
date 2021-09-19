/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
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
    prompt for the input of an infinite amount of numbers
    create command for when done inputting numbers
    store the inputs
    determine if the largest number by comparing them against each other
     print the largest number
     */

    public static boolean contain(int[] nums, int x) {

        for (int n : nums)

            if (n == x)

                return true;

        return false;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = new int[100];

        int count = 0;

        int largest = 0;

        while (true) { // make it while(count<10) for entering 10 numbers

            System.out.print("Enter any number (-1 to stop): ");

            int x = sc.nextInt();

            if (x == -1)

                break;

            if (contain(nums, x)) {

                System.out.println("Number already entered. Please Enter a different number!!");

                continue;

            }

            nums[count++] = x;

            largest = Math.max(x, largest);

        }

        System.out.println("The largest number is " + largest);

        sc.close();

    }
}