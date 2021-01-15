/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class QuestForTheUserInput {
    public static void main(String[] args) {
        
        
        String yourName;
        String yourQuest;
        double velocityOfSwallow;
        
        Scanner inputReader = new Scanner(System.in);
        
        //use scanners read line to assign value to strings
        System.out.print("What is your name?? ");
        yourName = inputReader.nextLine();
        
        System.out.print("What is your quest?! ");
        yourQuest = inputReader.nextLine();
        
        //for double use scanners nextDouble method or Double.parseDouble
        System.out.print("What is the velocity of an unladen swallow!?! ");
        velocityOfSwallow = Double.parseDouble(inputReader.nextLine());
        
        System.out.println();
        
        System.out.println("How do you know " + velocityOfSwallow + " is correct, " + yourName + "?");
        System.out.println("You didn't even know if the swallow was African or European!");
        System.out.println("Maybe skip answering things about birds, and instead go " + yourQuest + ".");
        
    }
}


