package com.practice.prime;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Circular Prime : A circular prime is a prime number with the property
 * that the number generated at each intermediate step when cyclically permuting its
 * (base 10) digits will be prime.
 *
 * For example, 1193 is a circular prime,
 * since 1931, 9311 and 3119 all are also prime.
 * A circular prime with at least two digits can only consist of combinations of the digits
 * 1, 3, 7 or 9, because having 0, 2, 4, 6 or 8 as the last digit makes the number divisible by 2,
 * and having 0 or 5 as the last digit makes it divisible by 5.
 */

public class CircularPrimes {
    public static
    boolean isPirme = true;
    private List<Integer> numberCheck = new ArrayList <Integer>();

    public List<Integer> getNumberCheck() {
        return numberCheck;
    }

    public static boolean isPrime(int num){
        //tests for the input number to see if it prime
        if (num <= 1) return false; // Numbers less than or equal to 1 are not prime

        // Loop from 2 to the square root of the number
        for (int i = 3; i <= Math.sqrt(num); i++) {
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


    public static void main(String[] args){

    }
}