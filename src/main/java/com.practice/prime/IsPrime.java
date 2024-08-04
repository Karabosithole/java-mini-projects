package com.practice.prime;

import java.util.Scanner;

/** prime numbers, not divisable by any number a whole number greater than 1
 * that cannot be exactly divided by any whole number other than itself
 * and 1 (e.g. 2, 3, 5, 7, 11).
*/

public class IsPrime {
   public static void primeNumberCheck(int num){

    }


    static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = scanner.nextInt();

       primeNumberCheck(num);
       scanner.close();

    }
}