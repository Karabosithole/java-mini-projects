package com.practice.algorithms.fibonacci;

import java.util.Scanner;

public class FibForLoop {

    public static void Fibs(int num){
        int a = 0;
        int b =1;

        if (num >0){
            System.out.print(a+ " ,");
        }
        if(num>b){
            System.out.print(b);
        }

        for (int i=2;i<num;i++){
            int next = a+b;
            System.out.print(" ,"+ next);
            a =b;
            b=next;

        }
        System.out.println();


    }



    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a limit");
        int num =sc.nextInt();
        Fibs(num);


    }
}
