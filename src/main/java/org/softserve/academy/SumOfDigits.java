package org.softserve.academy;

import java.util.Scanner;

/**
 * Task 7: Sum of Digits of a Number:
 * Write a program that calculates the sum of the digits of a given integer.
 */
public class SumOfDigits {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please input your number:");
        int number= sc.nextInt();
        int sum=0;
        do { sum+= number%10;
            number/=10;
        } while (number>0);
        System.out.println("Sum of digits of your number is: " + sum);
    }
}
