/*
 *  UCF COP3330 Fall 2021 Assignment 18 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise18.solution18;

/*
Create a program that converts temperatures from Fahrenheit to Celsius or from Celsius to Fahrenheit.
Prompt for the starting temperature.
The program should prompt for the type of conversion and then perform the conversion.
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

    public static void main(String arg[])
    {
        double f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose type of conversion \n 1.Fahrenheit to Celsius  \n 2.Celsius to Fahrenheit");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:  System.out.println("Enter  Fahrenheit temperature");
                f=sc.nextDouble();
                c=(f-32)*5/9;
                System.out.println("Celsius temperature is = "+c);
                break;
            case 2:  System.out.println("Enter  Celsius temperature");
                c=sc.nextDouble();
                f=((9*c)/5)+32;
                System.out.println("Fahrenheit temperature is = "+f);
                break;
            default:  System.out.println("please choose valid choice");
        }
    }
}
