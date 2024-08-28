package com.practice.prime;

import java.util.Scanner;

/** a prime number generator, prints all the prime numbers between the two inputs that the user has
 * entered, cheking that the first number is bigger than the other,
 * as I expand on this i will check which number is smaller and start from the smaller number, this includes
 * negative numbers
*/

public class IsPrimeGenerator {

    public static void numberChecker(int num) {
        boolean isPrime = true;

        if (num <= 1) {
            System.out.println(num + " is not prime");
            return;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not prime");
        }
    }




    public void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        numberChecker(num);

    }
}