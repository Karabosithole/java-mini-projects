package com.practice.dataStructures.listOperations;
import java.util.ArrayList;

public class ListOperations {



    //Add Elements
    public static void AddElements (ArrayList<Integer> List2){

       List2.add(2);
       System.out.println(List2);

    }
    //Insert Elements
    public static void InsertElements(int [] listOfNumbers){



    }

    //Remove Elements
    public static void RemovingElements(){

    }

    //Access Elements
    public static void AccessingElements(){

    }

    //Update Elements
    public static void UpdateElements(){

    }

    //Size of the List
    public static void SizeChecker(){}

    //Check if the List Contains an Element
    public static void CheckContainingElements(){

    }

    //Iterate Over the List
    public static void IterateOverElements(){

    }

    //Sort the List
    public static void SortList(){

    }

    //Clear the List
    public static void ClearList(){

    }

    //Convert Array to List
    public static void ConverToArray(){

    }

    //Reverse the List
    public static void ReverseList(){

    }

    //Find Index of an Element
    public static void FindIndexOfElement(){

    }

    public static void main(String []args){

        int [] listOfNumbers = {1,6,8,23,4,54,98};  // this type of array cannot be modified

        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
        AddElements(List2);
        InsertElements(listOfNumbers);
    }
}