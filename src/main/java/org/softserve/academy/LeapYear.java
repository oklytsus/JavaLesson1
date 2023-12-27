package org.softserve.academy;
/**
 * Task 9: Leap Year Check:
 * Write a program that determines whether a given year is a leap year.
 */

import java.util.Scanner;
public class LeapYear {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        // Leap year is divisible by 4
        // If it is divisible by 100, it must also be divisible by 400
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}


