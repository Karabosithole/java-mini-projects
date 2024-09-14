package com.practice.tinyProjects.fizzBuzz;

import java.util.Scanner;

/**Rules of the FizzBuzz Game
 The rules of the FizzBuzz game are very simple.

 Say Fizz if the number is divisible by 3.
 Say Buzz if the number is divisible by 5.
 Say FizzBuzz if the number is divisible by both 3 and 5.
 Return the number itself, if the number is not divisible by 3 and 5.
 */

public class FizzBuzz {

    public void fizzBuzzApplied(int number){

        if (number %3 != 0 && number%5 != 0){
            System.out.println(number);}

            if (number%3 == 0 && number%5 ==0 ){
            System.out.println("FizzBuzz");
        }

        if (number%3 ==0 || number %5 == 0){


            if (number %3 ==0 && number %5 !=0){
                    System.out.println("Fizz");}


            if (number %3 !=0 && number%5 ==0){
                    System.out.println("Buzz");}


            }

        }




    public static void main (String args []){

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scanner.nextInt();
        FizzBuzz obj = new FizzBuzz();
        obj.fizzBuzzApplied(number);

    }
}