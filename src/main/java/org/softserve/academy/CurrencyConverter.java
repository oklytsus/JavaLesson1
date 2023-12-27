package org.softserve.academy;

import java.util.Scanner;

/**
 * Task 2: Currency Converter:
 * Write a program that converts dollars to euros
 * (you can set the exchange rate as a constant).
 */
public class CurrencyConverter {
    static Scanner sc = new Scanner(System.in);
    private static final double EXCHANGE_RATE=0.85;
    public static void main(String[] args) {
        double dollar, euro;
        System.out.println("Enter amount in dollars");
        dollar= sc.nextDouble();
        euro=dollar*EXCHANGE_RATE;
        System.out.println("The amount of euro is: " + euro);

    }
}
