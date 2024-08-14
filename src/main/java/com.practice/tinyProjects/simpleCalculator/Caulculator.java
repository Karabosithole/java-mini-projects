package com.practice.tinyProjects.simpleCalculator;

import java.util.Scanner;

public class Caulculator {

    public double addition(double number1, double number2) {
        double added = number1 + number2;
        return added;
    }

    public double multiplication (double  number1, double number2){
        double multiplied = number1 * number2;
        return multiplied ;
    }

    public double subtraction (double number1, double number2){
        double subtracted = number1 - number2;
        return subtracted ;
    }


    public double division (double number1, double number2) {
        double divided = number1 /number2;
        return divided;
    }

    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number ");
        double number1 = scanner.nextDouble();

        System.out.println("please enter another numberm");
        double number2 = scanner.nextDouble();

        scanner.close();
          // todo add a switch case for options for what they person wants to do.


    }
}