package com.practice.prime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *all prime numbers that are greater than 2 can be expressed as the sum of 2 odd prime numbers.
*/

public class GoldbachConjecture {
    public static void ReturningNumbersPrimeProducts(int num){
        List<Integer> list = new ArrayList<>();

        for (int i =3 ; i <= Math.sqrt(num); i++){
                list.add(i);

        }
        System.out.print(list);

    }
    public static void ChecksforPrime(int num){


        for (int i =3 ; i <= Math.sqrt(num); i++){

    }}

    static void main (String args []){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input a number ");
        int num = scanner.nextInt();

        ReturningNumbersPrimeProducts(num);

        scanner.close();


    }
}