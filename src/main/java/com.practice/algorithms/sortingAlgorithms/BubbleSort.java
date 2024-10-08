package com.practice.algorithms.sortingAlgorithms;

import java.util.Scanner;

/**Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements
 *  if they are in the wrong order.
 *  This algorithm is not suitable for large data sets
 *  as its average and worst-case time complexity is quite high.
 */

public class BubbleSort {

    //array of elements user inputs

    public static void bubbleSort(int [] numbers){


    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the length you want your array: ");
        int n = sc.nextInt(); //user decides on the length of the array
        int [] a = new int[n]; // creating a new array

        for (int i = 0;i<n;i++){
            a[i] = sc.nextInt(); // Assign each input value to the array
        }
        sc.close();




    }















}