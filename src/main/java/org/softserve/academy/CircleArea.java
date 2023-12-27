package org.softserve.academy;

import java.util.Scanner;
import static java.lang.Math.*;

/**
 * Task 3: Circle Area Calculation:
 * Write a program that calculates the area of a circle given its radius.
 */
public class CircleArea {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter radius:");
        double radius =sc.nextDouble();
        double circleArea = PI*pow(radius,2);
        System.out.printf("Circle Area is: %.2f", circleArea);
    }
}
