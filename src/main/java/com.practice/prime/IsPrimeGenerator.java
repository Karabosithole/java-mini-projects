package com.practice.prime;

import java.util.Scanner;

/** a prime number generator, prints all the prime numbers between the two inputs that the user has
 * entered, cheking that the first number is bigger than the other,
 * as I expand on this i will check which number is smaller and start from the smaller number, this includes
 * negative numbers
*/

public class IsPrimeGenerator {

    public static void numberChecker(int num){
        boolean isPrime = true;
        for (int i=2;i<= Math.sqrt(num);i++){
            if(num%i == 0 )

                isPrime = false;

            else {isPrime = true;
            break; }
    }


    }



    public void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num = scanner.nextInt();
        numberChecker(num);

    }
}