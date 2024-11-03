package com.practice.maths.factorial;

public class Factorial {
    
    // Method to calculate factorial using recursion
    public static int calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number must be non-negative.");
        } else if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    // Main method to test the factorial calculation
    public static void main(String[] args) {
        int number = 5; // Example input
        int result = calculateFactorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}
