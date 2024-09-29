package com.practice.dataStructures.listOperations;
import java.util.ArrayList;

public class ListOperations {



    //Add Elements
    public static void AddElements (ArrayList<Integer> List2){

       List2.add(2);
       System.out.println(List2);

    }
    public static void InsertElements(int [] listOfNumbers){
        //TODO figure out how to turn a list back into an array so i can add to the list


    }
    //Insert Elements

    //Remove Elements

    //Access Elements

    //Update Elements

    //Size of the List

    //Check if the List Contains an Element

    //Iterate Over the List

    //Sort the List

    //Clear the List

    //Convert Array to List

    //Reverse the List

    //Find Index of an Element

    public static void main(String []args){

        int [] listOfNumbers = {1,6,8,23,4,54,98};  // this type of array cannot be modified

        ArrayList<Integer> List2 = new ArrayList<>();
        ArrayList<Integer> List3 = new ArrayList<>();
        AddElements(List2);
        InsertElements(listOfNumbers);
    }
}