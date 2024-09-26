package com.practice.tinyProjects.helloWorld;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class HelloTests {


        private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        private final PrintStream originalOut = System.out;

        @Before
        public void setUpStreams() {
            System.setOut(new PrintStream(outContent));
        }

        @After
        public void restoreStreams() {
            System.setOut(originalOut);
        }

        @Test
        public void testPrintHelloWorld() {
            HelloWorld helloWorld = new HelloWorld();
            helloWorld.printHelloWorld();
            assertEquals("Hello world\n", outContent.toString());
        }
    }
