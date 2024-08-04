package com.practice.prime;

import java.util.Scanner;

/** prime numbers, not divisable by any number a whole number greater than 1
 * that cannot be exactly divided by any whole number other than itself
 * and 1 (e.g. 2, 3, 5, 7, 11).
*/

public class IsPrime {
   public static void primeNumberCheck(int num) {
       boolean isPrime = true;
       if (num <= 1) {
       System.out.print(num + " isn't that special");
//           if (num <= 1) {
               isPrime = false;
       } else {
           for (int i = 2; i <= Math.sqrt(num); i++) {
               if (num % i == 0) {
                   isPrime = false;
                   break;
                   }
               }
           }

   }


    static void main(String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = scanner.nextInt();

       primeNumberCheck(num);
       scanner.close();

    }
}

//import java.util.HashMap;
//import java.util.Map;
//this way uses a hash map so clever the Sieve of Eratosthenes or by incorporating memoization
/** to store previously calculated prime numbers. Here's an example using memoization:
*/
//public class IsPrime {
//    // Map to store previously computed prime status of numbers
//    private static Map<Integer, Boolean> primeCache = new HashMap<>();
//
//    public static boolean isPrime(int num) {
//        if (primeCache.containsKey(num)) {
//            return primeCache.get(num);
//        }
//
//        boolean isPrime = true;
//
//        if (num <= 1) {
//            isPrime = false;
//        } else {
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    isPrime = false;
//                    break;
//                }
//            }
//        }
//
//        primeCache.put(num, isPrime);
//        return isPrime;
//    }
//
//    public static void primeNumberCheck(int num) {
//        if (isPrime(num)) {
//            System.out.println(num + " is a prime number.");
//        } else {
//            System.out.println(num + " is not a prime number.");
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] numbers = {2, 3, 4, 5, 29, 15, 17, 19, 20, 29, 2}; // Test with multiple numbers
//
//        for (int num : numbers) {
//            primeNumberCheck(num);
//        }
//    }
//}
