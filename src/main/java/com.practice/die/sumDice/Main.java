package com.practice.die.sumDice;

import java.util.Random;

public class Main {


    public static void main(String[] args) {


        //creating two instances of the Dice game class
        DiceGame computer = new DiceGame();
        DiceGame user = new DiceGame();

        //Keeping track of the computer and the users wins
        int computerWins = 0;
        int userWins = 0;
    }

    //random method to get what number a certain face of the die has.
    public int getFace() {
        Random random = new Random();
        int rand = 1;
        for (rand = 1; rand < 7; ++rand) {

        }
        return rand;

    }
}
//        while (true) {
//            rand = random.nextInt(1,7);
//            if(rand !=0) break;
//        }
//        System.out.print(rand);
//        return rand;


