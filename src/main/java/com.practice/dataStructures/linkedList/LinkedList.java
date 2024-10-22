package com.practice.dataStructures.linkedList;


public class LinkedList {
    // Node class for the linked list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head; // Head of the linked list

    // Constructor
    public LinkedList() {
        head = null;
    }

    // Add an element to the end of the list
    public void add(int data) {
        // Your code here
    }

    // Insert an element at a specific index
    public void insert(int index, int data) {
        // Your code here
    }

    // Remove an element from the list
    public void remove(int data) {
        // Your code here
    }

    // Access an element by index
    public int get(int index) {
        // Your code here
        return -1; // Placeholder
    }

    // Update an element at a specific index
    public void update(int index, int data) {
        // Your code here
    }

    // Get the size of the list
    public int size() {
        // Your code here
        return 0; // Placeholder
    }

    // Check if the list contains a specific element
    public boolean contains(int data) {
        // Your code here
        return false; // Placeholder
    }

    // Print all elements in the list
    public void printList() {
        // Your code here
    }

    // Clear the entire list
    public void clear() {
        // Your code here
    }

    // Reverse the linked list
    public void reverse() {
        // Your code here
    }

    // Main method for testing
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Example usage
        linkedList.add(10);
        linkedList.add(20);
        linkedList.insert(1, 15);
        linkedList.printList();
        linkedList.remove(10);
        linkedList.printList();
        System.out.println("Size of the list: " + linkedList.size());
        System.out.println("Element at index 1: " + linkedList.get(1));
    }
}

