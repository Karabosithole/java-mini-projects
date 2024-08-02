package com.practice.evenAndOdd;

import java.util.Scanner;
/**Starting with any positive integer N,
 * Collatz sequence is defined corresponding
 * to n as the numbers formed by the following operations :

 *If n is even, then n = n / 2.
 *If n is odd, then n = 3*n + 1.
 *Repeat above steps, until it becomes 1.
 * */
public class CollatzRecursive {

    static void CheckNumbers (int N){
        System.out.println(N);
        if (N == 1) {
            System.out.print(", "+N);
        }


    }



    public static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        CheckNumbers(N);
        scanner.close();


    }
}
