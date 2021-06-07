/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Emily Gensch
 */
package org.example;
import java.util.Scanner;

public class exercise13{
    public static void main(String[] args) {
        Scanner interest = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        int principal = interest.nextInt();

        System.out.print("What is the rate? ");
        double intRate = interest.nextDouble();
        double newintRate = intRate / 100;

        System.out.print("What is the number of years? ");
        int years = interest.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int compound = interest.nextInt();

        double endofInvest = principal * (Math.pow((1 + (newintRate / compound)),(compound * years)));

        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n", principal, intRate, years, compound, endofInvest);
        
    }
}