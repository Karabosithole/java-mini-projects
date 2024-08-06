package com.practice.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *all prime numbers that are greater than 2 can be expressed as the sum of 2 odd prime numbers.
*/

public class GoldbachConjecture {

    public static void TwoPrimeSum(List<Integer> list){


    }

    public static List<Integer> getPrimes(int num) {
        List<Integer> list = new ArrayList<>();

        // Loop from 3 to the given number and add primes to the list
        for (int i = 3; i <= num; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }

        return list; // Return the list of primes
    }

    public static boolean isPrime(int num){
        //tests for the input number to see if it prime
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime

        // Loop from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false; // If divisible by any number other than 1 and itself, not prime
        }
        return true;

//        for (int i =3 ; i <= Math.sqrt(num); i++){
            /** eg check Example:
            Consider checking if 29 is prime.
            The square root of 29 is approximately 5.39.
                    You only need to check divisibility for numbers up to 5 (i.e., 2, 3, and 5).
            If none of these numbers divide 29, then 29 is prime.
             */

    }

    static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number ");
        int num = scanner.nextInt();

        List<Integer> primes = getPrimes(num);
//        getPrimes(num);
        System.out.println("Prime numbers from 3 to " + num + ": " + primes);
      List<Integer> primes = getPrimes(num);
        TwoPrimeSum(list);

        scanner.close();


    }
}