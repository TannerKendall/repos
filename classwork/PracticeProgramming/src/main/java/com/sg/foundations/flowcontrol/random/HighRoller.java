/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class HighRoller {
    public static void main(String[] args) {
        
        Random diceRoller = new Random();
        Scanner inputReader = new Scanner(System.in);
        
        int numOfSides;
        
        System.out.println("TIME TO ROOOOLL THE DICE!");
        System.out.println("How many sides does the die you want to roll have?");
        numOfSides = inputReader.nextInt();
        System.out.println();
        int rollResult = diceRoller.nextInt(numOfSides) + 1;
        System.out.println("I rolled a " + rollResult);
        if (rollResult == 1) {
            System.out.println("You rolled a critical failure!");
        } else if (rollResult == numOfSides) {
            System.out.println("You rolled a critical! Nice job!");
        }
        
        
    }
}
