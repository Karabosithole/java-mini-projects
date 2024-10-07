package com.practice.basics.evenOddOperations;

import java.util.Scanner;

public class EvenOdd {
    static void newNumber(int num){

        if (num %2 == 0){
            System.out.print("the number is even");
        }else {System.out.print("the number is odd ");}

    }

    void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        sc.close();
        newNumber(num);


    }
}
