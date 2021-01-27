/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.luckysevens;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class LuckySevens {
    public static void main(String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        Random diceRoll = new Random();
        
        int die1, die2, betAmount, maxAmount, maxAmountRolls;
        int numOfRolls = 0;
        
        System.out.println("Thanks for playing Lucky Sevens! How many dollars do you have? ");
        betAmount = inputReader.nextInt();
        
        maxAmount = betAmount;
        maxAmountRolls = numOfRolls;
        while (betAmount > 0) {
            die1 = diceRoll.nextInt(6) + 1;
            die2 = diceRoll.nextInt(6) + 1;
            
            if (die1 + die2 == 7) {
                betAmount = betAmount + 4;
                numOfRolls++;
                if (betAmount >= maxAmount) {
                    maxAmount = betAmount;
                    maxAmountRolls = numOfRolls;
                }
            } else {
                betAmount = betAmount - 1;
                numOfRolls++;
            }
        }
        System.out.println("You are broke after " + numOfRolls + " rolls.");
        System.out.println("You should have quit after " + maxAmountRolls + " rolls, when you had $" + maxAmount + ".");
    }
}
