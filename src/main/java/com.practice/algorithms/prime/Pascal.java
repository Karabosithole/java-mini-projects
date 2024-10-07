package com.practice.algorithms.prime;

import java.util.Scanner;

/**The number of entries in every line is equal to line number.
 * For example, the first line has “1“, the second line has “1 1“,
 * the third line has “1 2 1“,.. and so on.
 * Every entry in a line is value of a Binomial Coefficient.
 * The value of ith entry in line number line is C(line, i).
 * The value can be calculated using following formula.
 * C(line, i) = line! / ( (line-i)! * i! )
 */

public class Pascal {

    static void triangle(int height){
            for (int i= 1; i<=height;i++){
                System.out.println(i);
            }

    }




    void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the height of the triangle");
        int height = sc.nextInt();
        sc.close();
        triangle(height);



    }
}