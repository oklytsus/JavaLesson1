package org.softserve.academy;

import java.util.Scanner;

/**
 * Task 5: Minimum of Three Numbers:
 * Write a program that finds the minimum of three numbers entered by the user.
 */
public class MinValue {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int length=3;
        int[] numbers =new int[length];
        System.out.printf("Please input %d numbers %n", length);
        for (int i=0; i<length; i++ ){ numbers[i]= sc.nextInt();}
        int min=numbers[0];
        for (int i=0; i<length; i++ ){if (numbers[i] < min ){ min = numbers[i];}
        }
        System.out.println("The min value is: " + min);

    }
}
