package com.practice.tinyProjects.helloWorld;

public class HelloWorld {



        public void printHelloWorld() {
                System.out.println("Hello world");
        }

        public void addingNumbers(){
               System.out.println(6+1);
        }

        public static void main(String[] args) {
//
                HelloWorld obj = new HelloWorld();  // Create an instance of MyClass
                obj.printHelloWorld(); // Call the instance method
                obj.addingNumbers();// Call the instance method
//

//                printHelloWorld();  // Calls static printHelloWorld()
//                addingNumbers();    // Calls static addingNumbers()
        }



}


