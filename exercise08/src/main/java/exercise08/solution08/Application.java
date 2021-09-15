package exercise08.solution08;

/*
Write a program to evenly divide pizzas. Prompt for the number of people, the number of pizzas, and the number of slices per pizza.
Ensure that the number of pieces comes out even. Display the number of pieces of pizza each person should get. If there are leftovers, show the number of leftover pieces.
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object to read inputs
prompt for the amount of people, amount of pizzas, and amount of slices per pizza
store the inputs of the user
compute the amount of slices per person and leftover slices
print out amount of people and pizzas, how many slices per person and leftover slices
     */

        public static void main(String[] args)
        {
        Scanner s=new Scanner(System.in);

        System.out.print("How many people? ");
        int people=s.nextInt();

        System.out.print("How many pizzas do you have? ");
        int pizzas=s.nextInt();

        System.out.print("How many slices per pizza? ");
        int slices=s.nextInt();

        int total=slices*pizzas;

        System.out.println(people+" people with "+pizzas+" pizzas ("+total+" slices)");

        if(total/people==1)
        {
            System.out.println("Each person gets "+total/people+" piece of pizza.");
            System.out.println("There are "+(total%people)+" leftover pieces.");
        }
        else
        {
            System.out.println("Each person gets "+total/people+" pieces of pizza.");
            System.out.println("There are "+(total%people)+" leftover pieces.");
        }


    }

}
