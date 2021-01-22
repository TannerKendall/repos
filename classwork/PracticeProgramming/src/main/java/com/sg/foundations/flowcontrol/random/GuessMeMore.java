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
public class GuessMeMore {
    public static void main(String[] args) {
        
        Scanner stringUserGuess = new Scanner(System.in);
        Random randomizer = new Random(); 
        
        int ourNumber;
        int userGuess;
        
        
        System.out.println("I've chosen a number between -100 and 100. Betcha can't guess it!");
        
        ourNumber = randomizer.nextInt(100 - -100) + -100;
        
        do {
            System.out.println("Your guess: ");
            userGuess = Integer.parseInt(stringUserGuess.nextLine());
            
            if (userGuess == ourNumber) {
                System.out.println("Wow, nice guess! That was it!");
            } else if (userGuess < ourNumber) {
                System.out.println("Ha, nice try - too low! Try again!");
            } else if (userGuess > ourNumber) {
                System.out.println("Ha, nice try - too high! Try again!");
            }
            
        
        
        } while (userGuess != ourNumber);
        
    }
}
