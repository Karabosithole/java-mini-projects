package com.practice.dataStructures.listOperations;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {



    //Add Elements
    public static void AddElements (ArrayList<Integer> list1, int a){

       list1.add(a);

        System.out.println("List after adding "+ a +"elements: " + list1);

    }
    //Insert Elements
    public static void InsertElements(ArrayList<Integer> list1, int a){
        list1.add(1,5);
        System.out.println("List after inserting 5 at index 1: " + list1);

    }

    //Remove Elements
    public static void RemovingElements(ArrayList<Integer> list1){
        if (!list1.isEmpty()) {
            list1.remove(2);
            System.out.println("List after removing element at index 2: " + list1);
        } else {
            System.out.println("List is empty. Cannot remove element.");
        }
    }

    //Access Elements
    public static void AccessingElements(ArrayList<Integer> list1){
        if (list1.size() > 2) {
            System.out.println("Element at index 2: " + list1.get(2));
        } else {
            System.out.println("List does not have enough elements.");
        }

    }

    //Update Elements
    public static void UpdateElements(ArrayList<Integer> list1){
        if (!list1.isEmpty()) {
            list1.set(0, 50);
            System.out.println("List after updating first element to 50: " + list1);
        } else {
            System.out.println("List is empty. Cannot update element.");
        }

    }

    //Size of the List
    public static void SizeChecker(ArrayList<Integer> list1){
        System.out.println(list1.size());
    }

    //Check if the List Contains an Element
    public static void CheckContainingElements(ArrayList<Integer> list1){
        if (list1.contains(2)){
            System.out.println("Yes this element is in the list");
        }


    }

    //Iterate Over the List
    public static void IterateOverElements(ArrayList<Integer> list1){

    }

    //Sort the List
    public static void SortList(ArrayList<Integer> list1){

    }

    //Clear the List
    public static void ClearList(ArrayList<Integer> list1){

    }

    //Convert Array to List
    public static void ConverToArray(ArrayList<Integer>list1){

    }

    //Reverse the List
    public static void ReverseList(ArrayList<Integer> list1){

    }

    //Find Index of an Element
    public static void FindIndexOfElement(ArrayList<Integer> list1){

    }

    public static void main(String []args){
        //TODO add a switch case statement here make it so the user can add what ever to one list, not many.

        int [] listOfNumbers = {1,6,8,23,4,54,98};  // this type of array cannot be modified

        ArrayList<Integer> list1 = new ArrayList<>();


        Scanner sc = new Scanner(System.in);
        System.out.println("Please pic an option");
        int n = sc.nextInt();
        int a = sc.nextInt();

        switch (n){
            case 1:
                AddElements (list1,a);
                break;
            case 2:
                InsertElements(list1,a);
                break;
            case 3:
                RemovingElements(list1);
                break;
            case 4:
                AccessingElements(list1);
                break;
            case 5:
                UpdateElements(list1);
                break;
            case 6:
                SizeChecker(list1);
                break;
            case 7:
                CheckContainingElements(list1);
                break;
            case 8:
                IterateOverElements(list1);
                break;
            case 9:
                SortList(list1);
                break;
            case 10:
                ClearList(list1);
                break;
            case 11:
                ConverToArray(list1);
                break;
            case 12:
                ReverseList(list1);
                break;
            case 13:
                FindIndexOfElement(list1);
                break;

        }
        ;
    }
}