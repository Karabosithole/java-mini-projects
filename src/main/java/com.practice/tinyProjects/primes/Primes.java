package com.practice.tinyProjects.primes;

import java.util.Scanner;

public class Primes {
    public void determainingPrime(int userInput){

        if (userInput >0){
            System.out.println("Please enter a positive number");
        }

        if (userInput>=2){

        }
    }


   public static void main (String [] args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter a number to asses if its odd or even");
       int userInput = scanner.nextInt();
       Primes obj = new Primes();
       obj.determainingPrime(userInput);

   }

}

//stregnths and weaknesses did team miss goal how solve how to ensure quality and fix errors