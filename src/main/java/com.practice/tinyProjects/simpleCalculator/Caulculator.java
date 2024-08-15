package com.practice.tinyProjects.simpleCalculator.calculator;

import java.util.Scanner;

public class Caulculator {


    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number ");
        double number1 = scanner.nextDouble();

        System.out.println("please enter another number ");
        double number2 = scanner.nextDouble();

        scanner.close();
          // todo add a switch case for options for what they person wants to do.


    }
}