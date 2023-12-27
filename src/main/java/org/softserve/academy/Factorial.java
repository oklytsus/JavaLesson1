package org.softserve.academy;
import java.util.Scanner;

/**
 * Task 10: Calculate the Factorial of a Number:
 * Write a program that calculates the factorial of a number entered by the user.
 */
public class Factorial {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a non-negative integer: ");
        int number = scanner.nextInt();

        // Close the scanner to prevent resource leak
        scanner.close();

        // Check if the entered number is non-negative
        if (number < 0) {
            System.out.println("Your number is negative.");
        } else {
            // Calculate and display the factorial
            long factorial = calculateFactorial(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }

    // Recursive method to calculate factorial
    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
