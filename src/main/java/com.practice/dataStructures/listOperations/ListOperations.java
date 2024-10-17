package com.practice.dataStructures.listOperations;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {



    //Add Elements
    public static void AddElements (ArrayList<Integer> List1){

       List1.add(2);
       List1.add(9);
       List1.add(100);
       System.out.println(List1);

    }
    //Insert Elements
    public static void InsertElements(ArrayList<Integer> List1){
        List1.add(1,5);

    }

    //Remove Elements
    public static void RemovingElements(ArrayList<Integer> List1){
        List1.remove(2);

    }

    //Access Elements
    public static void AccessingElements(ArrayList<Integer> List1){
        System.out.println(List1.get(2));


    }

    //Update Elements
    public static void UpdateElements(ArrayList<Integer> List2){

    }

    //Size of the List
    public static void SizeChecker(ArrayList<Integer> List2){
        int [] Prac = {1,4,5,7,9};
        System.out.println(Prac.length);
    }

    //Check if the List Contains an Element
    public static void CheckContainingElements(ArrayList<Integer> List2){
        if (List2.contains(2)){
            System.out.println("Yes this element is in the list");
        }


    }

    //Iterate Over the List
    public static void IterateOverElements(ArrayList<Integer> List2){

    }

    //Sort the List
    public static void SortList(ArrayList<Integer> List2){

    }

    //Clear the List
    public static void ClearList(ArrayList<Integer> List2){

    }

    //Convert Array to List
    public static void ConverToArray(ArrayList<Integer> List2){

    }

    //Reverse the List
    public static void ReverseList(ArrayList<Integer> List2){

    }

    //Find Index of an Element
    public static void FindIndexOfElement(ArrayList<Integer> List2){

    }

    public static void main(String []args){
        //TODO add a switch case statement here make it so the user can add what ever to one list, not many.

        int [] listOfNumbers = {1,6,8,23,4,54,98};  // this type of array cannot be modified

        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
        AddElements(List1);
//        InsertElements(listOfNumbers);
        SizeChecker(List1);

        Scanner sc = new Scanner(System.in);
        System.out.println("Please pic an option");
        System.out.println("");
    }
}