package com.practice.tinyProjects.fibonacci;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * This method calculates the nth number in the Fibonacci sequence.
 *
 * The Fibonacci sequence is a series of numbers in which each number
 * (Fibonacci number) is the sum of the two preceding ones. It starts
 * with 0 and 1.
 *
 * Example of the Fibonacci sequence:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ...
 *
 * The formula is:
 * F(n) = F(n-1) + F(n-2) for n >= 2, where:
 * - F(0) = 0
 * - F(1) = 1
 *
 * @param n The position in the Fibonacci sequence to calculate (non-negative).
 * @return The Fibonacci number at the nth position.
 */

public class FibonacciWithScanner {

    public void fibonacci(int num){
        ArrayList <Integer> fibList = new ArrayList<Integer>();
        int count = 0;
        int a = 0;
        int b = 1;

        if (num>0){
            fibList.add(a);
            count ++;
        }

        if (num>1){
            fibList.add(b);
            count++;
        }

        while (count<num){
            int c = a +b;
            fibList.add(c);
            count ++;
            a =b;
            b=c;
        }
        System.out.print(fibList);

        }








    public static void main (String args []){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number you want the fib sequence to end at: ");
        int num = scanner.nextInt();
        FibonacciWithScanner obj = new FibonacciWithScanner();
        obj.fibonacci(num);
    }
}