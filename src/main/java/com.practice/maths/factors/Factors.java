package com.practice.tinyProjects.factors;

import java.util.Scanner;

public class Factors {


    public void main (String [] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter what factors you want, eg. '2' for the factors of 2");
        int factor = scanner.nextInt();

        System.out.println("Please sent the number you would like it the factors to be listed till, eg '20'");
        int limit = scanner.nextInt();
    }
}