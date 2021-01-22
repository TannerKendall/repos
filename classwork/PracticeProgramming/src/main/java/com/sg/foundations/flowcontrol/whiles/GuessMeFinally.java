/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class GuessMeFinally {
    public static void main(String[] args) {
        
        Scanner stringUserGuess = new Scanner(System.in);
        Random randomizer = new Random(); 
        
        int ourNumber;
        int userGuess;
        int loopCounter = 0;
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        System.out.println("Your guess: ");
        
        ourNumber = randomizer.nextInt(100 - -100) + -100;
        
        do {
            userGuess = Integer.parseInt(stringUserGuess.nextLine());
            
            if (userGuess == ourNumber && loopCounter !=0) {
                System.out.println("Finally! It's about time you got it!");
            } else if (userGuess < ourNumber) {
                System.out.println("Ha, nice try - too low! Try again!");
                System.out.println("Your guess: ");
            } else if (userGuess > ourNumber) {
                System.out.println("Ha, nice try - too high! Try again!");
                System.out.println("Your guess: ");
            }
            
        
            loopCounter++;
            
            
        } while (userGuess != ourNumber);
        
        if (loopCounter == 1) {
            System.out.println("Wow, nice guess! That was it!");
        }
        
    }
}
