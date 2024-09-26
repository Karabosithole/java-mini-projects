# Dice Roller

This project is a simple program to roll a specified number of dice with a specified number of sides and calculate the sum of the results.

## Features

- Roll a specified number of dice
- Each die can have a custom number of sides
- Calculate and display the sum of all rolled dice

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your machine
- Gradle or Maven for building the project

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/Karabosithole/dice-roller.git
    ```
2. Navigate to the project directory:
    ```sh
    cd dice-roller
    ```
3. Build the project:
    ```sh
    ./gradlew build   # If you are using Gradle
    ```
   or
    ```sh
    mvn install       # If you are using Maven
    ```

### Usage

1. Run the program:
    ```sh
    ./gradlew run     # If you are using Gradle
    ```
   or
    ```sh
    mvn exec:java     # If you are using Maven
    ```

2. Follow the on-screen prompts to enter the number of dice and the number of sides per die.

### Running Tests

1. Run the tests:
    ```sh
    ./gradlew test    # If you are using Gradle
    ```
   or
    ```sh
    mvn test          # If you are using Maven
    ```