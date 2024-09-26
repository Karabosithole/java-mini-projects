package com.practice.algorithms.prime;

import java.util.Scanner;

/** a prime number generator, prints all the prime numbers between the two inputs that the user has
 * entered, cheking that the first number is bigger than the other,
 * as I expand on this i will check which number is smaller and start from the smaller number, this includes
 * negative numbers
*/

public class IsPrimeGenerator {

    public static void numberChecker(int firstNum,int limit ) {
        boolean isPrime = true;

        if (firstNum <= 1) {
            System.out.println("the prime numbers between" +firstNum + "and" + limit);
            return;
        }

        for (int i = 2; i <= Math.sqrt(firstNum); i++) {
            if (firstNum % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(firstNum + " is a prime number");
        } else {
            System.out.println(firstNum + " is not prime");
        }
    }




    public void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the start number: ");
        int firstNum = scanner.nextInt();
        System.out.println("Please enter the last number: ");
        int limit = scanner.nextInt();
        scanner.close();
        numberChecker(firstNum, limit);

    }
}