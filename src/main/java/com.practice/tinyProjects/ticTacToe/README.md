# Tic-Tac-Toe Game

This is a simple Tic-Tac-Toe game implemented in Java using the Swing framework for the graphical user interface. The game allows two players to take turns marking spaces in a 3×3 grid. The player who succeeds in placing three of their marks in a horizontal, vertical, or diagonal row wins the game.

## Features

- Two-player mode (Player X and Player O)
- Randomly selects which player starts first
- Graphical user interface using Java Swing
- Displays the winner or if the game ends in a draw

## Installation

To run this project, ensure you have Java installed on your machine. You can clone the repository and compile the code using the following steps:

1. Clone the repository:
    ```sh
    git clone https://github.com/your-username/tic-tac-toe.git
    cd tic-tac-toe
    ```

2. Compile the code:
    ```sh
    javac -d bin -sourcepath src src/com/practice/tinyProjects/ticTacToe/TicTacToe.java
    ```

3. Run the game:
    ```sh
    java -cp bin com.practice.tinyProjects.ticTacToe.TicTacToe
    ```

## How to Play

1. Run the application.
2. A window will appear with a 3x3 grid and a text field at the top displaying "Tic-Tac-Toe".
3. The text field will display whose turn it is (X or O).
4. Players take turns clicking on the buttons in the grid to mark their symbol (X or O).
5. The game will automatically check for a winner or a draw after each move.
6. The game ends when a player has three of their marks in a row (horizontal, vertical, or diagonal) or when all nine squares are filled with no winner (draw).
7. The text field will display the result (e.g., "X wins", "O wins", or "Draw").

## Code Structure

- `TicTacToe`: Main class that sets up the game window, initializes components, and handles game logic.
    - `firstTurn()`: Randomly decides which player starts first.
    - `check()`: Checks all possible winning combinations.
    - `xWins(int a, int b, int c)`: Handles the case when player X wins.
    - `oWins(int a, int b, int c)`: Handles the case when player O wins.
    - `actionPerformed(ActionEvent e)`: Handles button clicks and updates the game state accordingly.


## Acknowledgements

- This project uses Java Swing for the graphical user interface.
- Inspired by the classic Tic-Tac-Toe game.

## Author

- [Karabo Sithole](https://github.com/Karabosithole)

