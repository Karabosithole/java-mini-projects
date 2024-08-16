package com.practice.tinyProjects.simpleCalculator;

import java.util.Scanner;

import static com.practice.tinyProjects.simpleCalculator.addition.Addition.addition;

public class Caulculator {

    public static class NumberProcessor {
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

       NumberProcessor numberProcessor = new NumberProcessor();
        numberProcessor.processNumberInputs();

        double number1 = numberProcessor.getNumber1();
        double number2 = numberProcessor.getNumber2();

        Scanner scanner = new Scanner(System.in);
        System.out.println("What operation would you like to proceed with?");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                addition(number1,number2);
                break;
            case 2:
//                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
//                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                if (number2 != 0) {
//                    System.out.println("Result: " + (number1 / number2));
                } else {
//                    System.out.println("Error: Division by zero");
                }
                break;
            default:
//                System.out.println("Invalid choice");
                break;
        }

        scanner.close();
    }

    }
}