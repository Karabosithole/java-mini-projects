package com.practice.basics.parity;

import java.util.Scanner;

/**
 * Parity is essentially a fancy name for checking whether a number is even or odd.
 * It's often used in more formal contexts like computer science, mathematics, and digital
 * communication, but at its core, it's just about determining if a number is divisible by 2 (even) or not (odd).
 *
 * In essence:
 * - Even parity means the number is divisible by 2 (e.g., 2, 4, 6).
 * - Odd parity means the number is not divisible by 2 (e.g., 1, 3, 5).
 *
 * This class provides methods to easily check if a given number has even or odd parity.
 */

public class ParityChecker {

    static boolean isEven(int num){
        return num % 2 == 0;
    }

    static boolean isOdd (int num){
        return num % 2 !=0;
    }


    void main(String [] arga){
        Scanner sc =new Scanner(System.in);
        ParityChecker checker = new ParityChecker();
        System.out.println("Please enter a number to check for parity: ");
        int num = sc.nextInt();
        sc.close();

        if (checker.isEven(num)) {
            System.out.println("Number is Even");
        }
        if (checker.isOdd(num)){
            System.out.println("Number is odd");
        }

    }
}