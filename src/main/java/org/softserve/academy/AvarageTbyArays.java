package org.softserve.academy;

import java.util.Scanner;

public class AvarageTbyArays
{
    static Scanner sc = new Scanner(System.in);
    public static void main( String[] args )
    {
        float averageT, sum=0;
        int days=5;
        float[] temperature = new float[days];


        for (int i=0; i<=days; i++ ){
            System.out.println("Please input temperature for day" + i);
            temperature[i-1]= sc.nextFloat();
            sum+=temperature[i-1];
        };

        averageT=sum/days;
        System.out.print("The average temperature for " +days+ " days is : ");
        System.out.printf(String.valueOf(averageT));
        System.out.println();
       // System.out.printf("The average temperature for %d days: %.2f%n", days, averageT);



    }
}
