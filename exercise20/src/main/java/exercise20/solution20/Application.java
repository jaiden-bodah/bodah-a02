/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 Jaiden Bodah
 */

package exercise20.solution20;

/*
Create a tax calculator that handles multiple states and multiple counties within each state.
The program prompts the user for the order amount and the state where the order will be shipped.
 */

import java.util.Scanner;

public class Application {

    /*
create a scanner object
    read in an input to determine the order amount and the state you live in
    store the inputs
    if the state is Wisconsin prompt the county
    based on county calculate the tax
    if the state is Illinois calculate the tax
    if any other state no tax
    calculate and store the tax, then add the total together
     print out what the tax and total are
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float amount;
        float tAmount = 0.0F, tax = 0.0F;

        System.out.print("What is order amount? ");
        amount = sc.nextInt();

        System.out.print("What state do you live in? ");
        String state = sc.next();

        if(state.equals("Wisconsin")){
            System.out.print("What country do you live in? ");
            String county = sc.next();
            if(county.equals("EauClaire")){
                tax = (float) ((amount*5.005)/100);
                tAmount = tax + amount;
            }
            else if(county.equals("Dunn")){
                tax = (float) ((amount*5.004)/100);
                tAmount = tax + amount;
            }
            else{
                System.out.println("Plese enter correct country");
            }
        }
        else if(state.equals("Illinois")){
            tax = (amount * 8) / 100;
            tAmount = tax + amount;
        }
        else{
            tax = 0.0F;
            tAmount = amount;
        }
        System.out.println("The tax is  $"+String.format("%.2f",tax));
        System.out.println("The total is  $"+String.format("%.2f",tAmount));
    }
}
