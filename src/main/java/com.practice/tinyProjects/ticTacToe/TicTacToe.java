package com.practice.tinyProjects.ticTacToe;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class TicTacToe implements ActionListener{
    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9]; //we just want 9 new buttons
    boolean player1_turn; //if player 1 is false it means its player 2's turn.


    TicTacToe(){ // creating the constructor
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,800);
        frame.getContentPane().setBackground(new Color(50,50,50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(25,255,0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0,0,800,100);

        button_panel.setLayout(new GridLayout(3,3));
        button_panel.setBackground(new Color(150,150,25));
        for (int i=0;i<9;i++){
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli",Font.BOLD,120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
        }

        title_panel.add(textfield);
        frame.add(title_panel,BorderLayout.NORTH);
        frame.add(button_panel);

        firstTurn();


    }

//    @Override
//    public void actionPerformed (ActiveEvent e){
//        //TODO Auto-generated method stub
//
//    }
    public void firstTurn (){
       try {
           Thread.sleep(2000); /// adds delay before someone else's turn
       }catch (InterruptedException e){
           e.printStackTrace();
       }

        if(random.nextInt(2)==0) {
            player1_turn= true;
            textfield.setText("X turn");
        }
        else {
            player1_turn =false;
            textfield.setText("O");
        }

    }
    public void check (){
       //method to check for winning player
    }

    public void xWins(int a, int b, int c){

    }
    public void oWins(int a, int b, int c){

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = 0; i<9;i++) {
            if (e.getSource() == buttons[i]) {
                if(player1_turn){
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(225,0,0));
                        buttons[i].setText("X");
                        player1_turn=false;
                        textfield.setText("O turn");
                        check();
                    }
                }
                else{
                    if(buttons[i].getText()==""){
                        buttons[i].setForeground(new Color(0,0,255));
                        buttons[i].setText("X");
                        player1_turn=true;
                        textfield.setText("X turn");
                        check();
                }
            }

        }
        }
    }



}


}
