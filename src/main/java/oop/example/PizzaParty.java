/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Angelica Palacio
 */
package oop.example;
import java.util.Scanner;

public class PizzaParty
{
    public static void main( String[] args)
    {
        System.out.print("How many people? ");

        Scanner input = new Scanner(System.in);
        String firstNum = input.nextLine();
        int people = Integer.parseInt(firstNum);

        System.out.print("How many pizzas do you have? ");

        String secondNum = input.nextLine();
        int pizzas = Integer.parseInt(secondNum);

        int total = pizzas * 8;
        int slices = total / people;
        int leftovers = total - (people * slices);

        System.out.println(people + " people with " + pizzas + " pizzas (" + total + " slices)");

        // Plural/Singular slice challenge
        if(slices == 1)
        {
            System.out.println("Each person gets " + slices + " piece of pizza.");
        }
        else
        {
            System.out.println("Each person gets " + slices + " pieces of pizzas.");
        }
        if(leftovers == 1)
        {
            System.out.println("There is " + leftovers + " leftover piece.");
        }
        else
        {
            System.out.println("There are " + leftovers + " leftover pieces.");
        }
    }
}
