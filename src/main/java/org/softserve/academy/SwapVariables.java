package org.softserve.academy;

import java.util.Scanner;

/**
 * Task 8: Swap Variables:
 * Write a program that swaps the values of two variables without using additional variables.
 */
public class SwapVariables {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Display the values before swapping
        System.out.println("Before swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap the values without using additional variables
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        // Display the values after swapping
        System.out.println("\nAfter swapping: ");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}