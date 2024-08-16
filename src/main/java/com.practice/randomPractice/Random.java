package com.practice.randomPractice;

import java.util.Scanner;

import static java.lang.System.in;

public class Random {

    //practicing java for loops pringting 0 to 5
    public static void counting()
    {
        for (int i = 0; i<5; i++){
            System.out.println(i);
        }
    }
    public static void FavouriteQote(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pick a number from 1 to 5");
        int number = scanner.nextInt();

        scanner.close();

        switch (number){
            case 1:
                System.out.println("\"The only limit to our realization of tomorrow is our doubts of today.\" — Franklin D. Roosevelt");
                break;
            case 2:
                System.out.println("\"In the end, we will remember not the words of our enemies, but the silence of our friends.\" — Martin Luther King Jr.");
                break;
            case 3:
                System.out.println("\"Life is what happens when you're busy making other plans.\" — John Lennon");
                break;

            case 4:
                System.out.println("\"Success is not the key to happiness. Happiness is the key to success. If you love what you are doing, you will be successful.\" — Albert Schweitzer");
                break;
            case 5:
                System.out.println("\"Do not wait to strike till the iron is hot, but make it hot by striking.\" — William Butler Yeats");
                break;
        }
    }


    public static void main (String args []){
        counting();
        FavouriteQote();


    }



}