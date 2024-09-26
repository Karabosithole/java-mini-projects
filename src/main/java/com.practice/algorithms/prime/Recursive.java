package com.practice.algorithms.prime;
import java.util.Scanner;


public class Recursive {

    /**
     * Recursively checks whether a number is prime.
     * <p>
     * A prime number is a number greater than 1 that is only divisible by 1 and itself.
     * This function checks divisibility by decrementing the divisor until it reaches 2.
     * If no divisors are found that evenly divide the number, the number is prime.
     *
     * @param n       The number to check for primality.
     * @param divisor The divisor to check divisibility of n. Initially, this should be set to n - 1.
     * @return True if the number is prime, False otherwise.
     * <p>
     * Example usage:
     * <pre>
     * {@code
     * PrimeChecker.isPrime(7, 6);  // returns true
     * PrimeChecker.isPrime(10, 9); // returns false
     * }
     * </pre>
     */
    public static class PrimeChecker {
        public static boolean isPrime(int n, int divisor) {
            if (n < 2) {
                return false;
            }
            if (divisor == 1) {
                return true;
            }
            if (n % divisor == 0) {
                return false;
            }
            return isPrime(n, divisor - 1);
        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number: ");
            int n = scanner.nextInt();

            // Set the divisor as n - 1
            int divisor = n - 1;

            // Check if the number is prime and print the result
            boolean result = isPrime(n, divisor);
            if (result) {
                System.out.println(n + " is a prime number.");
            } else {
                System.out.println(n + " is not a prime number.");
            }

            scanner.close();
        }

    }
}

