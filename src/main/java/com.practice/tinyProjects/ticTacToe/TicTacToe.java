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

    TicTacToe(){ // creating the constructor


    }

    @Override
    public void actionPerformed (ActiveEvent e){
        //TODO Auto-generated method stub

    }
    public void firstTurn (){

    }
    public void check (){
       //method to check for winning player
    }

    public void xWins(int a, int b, int c){

    }
    public void oWins(int a, int b, int c){

    }

}