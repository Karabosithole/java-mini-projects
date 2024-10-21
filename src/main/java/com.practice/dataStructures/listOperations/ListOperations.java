package com.practice.dataStructures.listOperations;
import java.util.ArrayList;
import java.util.Scanner;

public class ListOperations {



    //Add Elements
    public static void AddElements (ArrayList<Integer> list1){

       list1.add(2);

        System.out.println("List after adding elements: " + list1);

    }
    //Insert Elements
    public static void InsertElements(ArrayList<Integer> list1){
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
        System.out.println("Size of the list: " + list1.size());
    }

    //Check if the List Contains an Element
    public static void CheckContainingElements(ArrayList<Integer> list1){
        if (list1.contains(2)) {
            System.out.println("Yes, the element 2 is in the list.");
        } else {
            System.out.println("No, the element 2 is not in the list.");
        }
    }

    //Iterate Over the List
    public static void IterateOverElements(ArrayList<Integer> list1){
        System.out.println("Iterating over the list:");
        for (Integer element : list1) {
            System.out.println(element);
        }
    }

    //Sort the List
    public static void SortList(ArrayList<Integer> list1){
        list1.sort(Integer::compareTo);
        System.out.println("List after sorting: " + list1);
    }

    //Clear the List
    public static void ClearList(ArrayList<Integer> list1){
        list1.clear();
        System.out.println("List cleared.");
    }

    //Convert Array to List
    public static void ConverToArray(ArrayList<Integer>list1){
        Integer[] array = list1.toArray(new Integer[0]);
        System.out.println("Converted list to array: " + java.util.Arrays.toString(array));

    }

    //Reverse the List
    public static void ReverseList(ArrayList<Integer> list1){
        java.util.Collections.reverse(list1);
        System.out.println("List after reversing: " + list1);
    }

    //Find Index of an Element
    public static void FindIndexOfElement(ArrayList<Integer> list1){
        int index = list1.indexOf(100);
        if (index != -1) {
            System.out.println("Element 100 found at index: " + index);
        } else {
            System.out.println("Element 100 not found in the list.");
        }
    }

    public static void main(String []args){
        //TODO add a switch case statement here make it so the user can add what ever to one list, not many.

        ArrayList<Integer> list1 = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please pick an option (1-13):");
        System.out.println("1. Add elements to the list");
        System.out.println("2. Insert an element at a specific index");
        System.out.println("3. Remove an element from the list");
        System.out.println("4. Access an element by index");
        System.out.println("5. Update an element at a specific index");
        System.out.println("6. Check the size of the list");
        System.out.println("7. Check if the list contains a specific element");
        System.out.println("8. Iterate over the elements of the list");
        System.out.println("9. Sort the list");
        System.out.println("10. Clear the entire list");
        System.out.println("11. Convert the list to an array");
        System.out.println("12. Reverse the order of the list");
        System.out.println("13. Find the index of a specific element");
        int option = scanner.nextInt();


        switch (option){
            case 1:
                AddElements (list1);
                break;
            case 2:
                InsertElements(list1);
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

    }
}