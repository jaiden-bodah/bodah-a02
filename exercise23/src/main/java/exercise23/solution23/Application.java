/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise23.solution23;

/*
Create a program that walks the user through troubleshooting issues with a car.
Use the following decision tree to build the system (you can visualize this tree in PlantUML):
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object
    prompt for the user to give answers about the car
    store the inputs
    have those inputs determine the problem with the car and the next step to take
    determine if the car is working, how to fix it, or if it is even possible for the problem to occur
    print out lines based upon choices
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char choice;

        System.out.print("Is the car silent when you turn the key? ");

        choice = sc.next().charAt(0);

        if (choice == 'y') {

            System.out.print("Are the Battery terminals corroded? ");

            choice = sc.next().charAt(0);

            if (choice == 'y')

                System.out.println("Battery may not be clean.\nClean the terminals and try starting again.");

            else

                System.out.println("The battery cables may be damaged.\nReplace cables and try again");

        } else {

            System.out.print("Does the car make a slicking noise? ");

            choice = sc.next().charAt(0);

            if (choice == 'y')

                System.out.println("Battery may be damaged.\nReplace the Battery.");

            else {

                System.out.print("Does the car crank up but fail to start? ");

                choice = sc.next().charAt(0);

                if (choice == 'y')

                    System.out.println("Spark plug connection may be loose.\nCheck spark plug connection.");

                else {

                    System.out.print("Does the engine start and then die? ");

                    choice = sc.next().charAt(0);

                    if (choice == 'y') {

                        System.out.println("Does your car have fuel injection? ");

                        choice = sc.next().charAt(0);

                        if (choice == 'y')

                            System.out.println("Get in it for service.");

                        else

                            System.out.println("Check to ensure the choke is opening and closing.");

                    } else {

                        System.out.println("This should not be possible.");

                    }

                }

            }

        }

        sc.close();

    }
}
