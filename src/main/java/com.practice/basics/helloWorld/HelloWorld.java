package com.practice.basics.helloWorld;

public class HelloWorld {



        public void printHelloWorld() {
                System.out.println("Hello world");
        }

        public void addingNumbers(){
               System.out.println(6+1);
        }

        public static void main(String [] args) {
//
                HelloWorld obj = new HelloWorld();  // Create an instance of MyClass
                obj.printHelloWorld(); // Call the instance method
                obj.addingNumbers();// Call the instance method


                /** another way to do it*/
//                HelloWorld obj1 = new HelloWorld();
//                HelloWorld obj2 = new HelloWorld();
//                Runnable r = obj1::printHelloWorld;
//                r.run();  //Calls the run() method directly, prints "Hello world"
//                Runnable a = obj2::addingNumbers;
//                a.run();





//                printHelloWorld();  // Calls static printHelloWorld()
//                addingNumbers();    // Calls static addingNumbers()
        }



}


