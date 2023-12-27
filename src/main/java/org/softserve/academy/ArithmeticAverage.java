package org.softserve.academy;

import java.util.Scanner;

/**
 * Task 6: Calculate the Arithmetic Average:
 * Write a program that calculates the average of an array of numbers.
 */
public class ArithmeticAverage
{
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        float average, sum=0;
        int length=5;
        int[] numbers =new int[length];

        System.out.printf("Please input %d numbers %n", length);
        for (int i=0; i<length; i++ ){
            numbers[i]= sc.nextInt();
            sum+=numbers[i];
        };

        average=sum/length;

        System.out.printf("The average of your numbers is: %.2f%n", average);

    }
}

