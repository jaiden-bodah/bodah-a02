/*
 *  UCF COP3330 Fall 2021 Assignment 07 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise15.solution15;

/*
Create a simple program that validates user login credentials.
The program must prompt the user for a username and password.
The program should compare the password given by the user to a known password.
If the password matches, the program should display "Welcome!"
If it doesn't match, the program should display "I don’t know you."
 */

import java.util.Scanner;

public class Application {

     /*
create a scanner object
    create a string that stores the system password
    prompt for an input of the password
    store the input as a string
    determine if the password and password attempt match
     print if they are welcomed to they got the password correct or incorrect
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String password;
        password = "abc$123";

        System.out.print("What is the password? ");
        String passattempt = (input.nextLine());

        if (password.equals(passattempt))
            System.out.println("Welcome!");
         else
            System.out.println("I don't know you.");
    }
}