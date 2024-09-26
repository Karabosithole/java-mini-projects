package com.practice.algorithms.fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class provides a method to generate and print the Fibonacci sequence up to a given number using user input.
 * It takes the user input from the console using a Scanner and generates the Fibonacci sequence up to the given number.
 */
public class FibonacciWithScanner {
    /**
     * Generates the Fibonacci sequence up to the specified number and stores it in a list.
     * The method adds the first two Fibonacci numbers (0 and 1) to the list, and then continues
     * generating the sequence until the total number of elements in the list equals the input number.
     *
     * @param num The number of Fibonacci numbers to generate. If num is 0, no numbers are generated.
     *            If num is 1, only the first Fibonacci number (0) is added.
     */

    public void fibonacci(int num){
        ArrayList <Integer> fibList = new ArrayList<Integer>();
        int count = 0;
        int a = 0;
        int b = 1;

        // Add the first Fibonacci number if num > 0
        if (num>0){
            fibList.add(a);
            count ++;
        }

        // Add the second Fibonacci number if num > 1
        if (num>1){
            fibList.add(b);
            count++;
        }

        // Generate the rest of the Fibonacci sequence until count reaches num
        while (count<num){
            int c = a +b;
            fibList.add(c);
            count ++;
            a =b;
            b=c;
        }
        // Print the Fibonacci sequence
        System.out.print(fibList);

        }

    public static void main (String [] args){

        Scanner scanner = new Scanner(System.in);
        // Prompt the user to input the number of Fibonacci numbers they want to generate
        System.out.println("Please enter a number you want the fib sequence to end at: ");
        int num = scanner.nextInt();
        scanner.close();

        // Create an instance of FibonacciWithScanner and generate the Fibonacci sequence
        FibonacciWithScanner obj = new FibonacciWithScanner();
        obj.fibonacci(num);
    }
}