package com.practice.prime;

import java.util.Scanner;

/**
 *all prime numbers that are greater than 2 can be expressed as the sum of 2 odd prime numbers.
*/

public class GoldbachConjecture {
    public static void IsItPrime(int num){

    }

    static void main (String ages []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number ");
        int num = scanner.nextInt();

        IsItPrime(num);

        scanner.close();


    }
}