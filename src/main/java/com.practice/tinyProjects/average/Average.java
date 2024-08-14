package com.practice.tinyProjects.average;

import java.util.Scanner;

public class Average {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numberCount =3;
//Defining the numbers

        System.out.println("Please enter a number: ");
        double num1 = scanner.nextDouble();

        System.out.println("Please enter the next number ");
        double num2 = scanner.nextDouble();

        System.out.println("Please enter the next number ");
        double num3 = scanner.nextDouble();

        // Close the scanner
        scanner.close();

        //calculate the sum of the numbers
        double sum = num1 +num2 +num3;
        //define how many numbers there are

        //find the avarage of them
        double avarage = sum /numberCount;

        System.out.println(avarage);

    }
}