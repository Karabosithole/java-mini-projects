package com.practice.dataStructures.stack;


import java.util.Stack;

public class StackExamples {
    private Stack<Integer> stack;

    // Constructor
    public StackExamples() {
        stack = new Stack<>();
    }

    // Push an element onto the stack
    public void push(int data) {
        // Your code here
    }

    // Pop an element from the stack
    public void pop() {
        // Your code here
    }

    // Peek at the top element of the stack
    public int peek() {
        // Your code here
        return -1; // Placeholder
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        // Your code here
        return true; // Placeholder
    }

    // Get the size of the stack
    public int size() {
        // Your code here
        return 0; // Placeholder
    }

    // Print all elements in the stack
    public void printStack() {
        // Your code here
    }

    // Main method for testing
    public static void main(String[] args) {
        StackExamples stackExamples = new StackExamples();

        // Example usage
        stackExamples.push(10);
        stackExamples.push(20);
        System.out.println("Top element: " + stackExamples.peek());
        stackExamples.pop();
        stackExamples.printStack();
        System.out.println("Is the stack empty? " + stackExamples.isEmpty());
        System.out.println("Size of the stack: " + stackExamples.size());
    }
}

