package com.practice.evenAndOdd;

import java.util.Scanner;

public class EvenAndOdd {


    static void EvenNumber(int N)
    {
        if (N%2 == 0){
        System.out.println("This is an even number");
        }
        else{
            System.out.println("This is an odd number");

    }
    }
    // Driver Code
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();

        EvenNumber(N);

        scanner.close();
        // Given Number N
//        int N = 10;
        // Function Call
//        EvenNumber(N);
    }
}
