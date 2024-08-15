package com.practice.tinyProjects.simpleCalculator;

import java.util.Scanner;

public class Caulculator {

    public class NumberProcessor {
        private double number1;
        private double number2;

        public void processNumberInputs() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter a number ");
            number1 = scanner.nextDouble();

            System.out.println("Please enter another number ");
            number2 = scanner.nextDouble();
        }

        // You can add methods to retrieve these numbers later if needed
        public double getNumber1() {
            return number1;
        }

        public double getNumber2() {
            return number2;
        }
    }

    public static void main (String args[]){

//        System.out.println("What operation would you like to procced with?");
//        int num = scanner.nextInt();
//        switch (num){
//            case 1:
//
//        }
//
//        scanner.close();
          // todo add a switch case for options for what they person wants to do.


    }
}