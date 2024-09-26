package com.practice.miniProjects.simpleCalculator.division;

public class Division {

    public static void division (double number1, double number2) {
        if (number2!=0){
        double divided = number1 /number2;

            System.out.println("Result: " + divided);
        }
        else {
            System.out.println("Error: Division by zero");
        }
    }
}
