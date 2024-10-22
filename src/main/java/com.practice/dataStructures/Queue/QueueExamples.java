package com.practice.dataStructures.Queue;


import java.util.LinkedList;
import java.util.Queue;

public class QueueExamples {
    private Queue<Integer> queue;

    // Constructor
    public QueueExamples() {
        queue = new LinkedList<>();
    }

    // Add an element to the queue
    public void enqueue(int data) {
        // Your code here
    }

    // Remove an element from the queue
    public void dequeue() {
        // Your code here
    }

    // Peek at the front element of the queue
    public int peek() {
        // Your code here
        return -1; // Placeholder
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        // Your code here
        return true; // Placeholder
    }

    // Get the size of the queue
    public int size() {
        // Your code here
        return 0; // Placeholder
    }

    // Print all elements in the queue
    public void printQueue() {
        // Your code here
    }

    // Main method for testing
    public static void main(String[] args) {
        QueueExamples queueExamples = new QueueExamples();

        // Example usage
        queueExamples.enqueue(10);
        queueExamples.enqueue(20);
        System.out.println("Front element: " + queueExamples.peek());
        queueExamples.dequeue();
        queueExamples.printQueue();
        System.out.println("Is the queue empty? " + queueExamples.isEmpty());
        System.out.println("Size of the queue: " + queueExamples.size());
    }
}
