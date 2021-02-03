/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int rounds;
        String player;
        String again;
        boolean y = true;
        
        System.out.println("-----ROCK PAPER SCISSORS-----");
        System.out.println("");
        do {
            int playerScore = 0;
            int npcScore = 0;
            int ties = 0;
            System.out.println("How many rounds would you like to play? (1-10)");
            rounds = inputReader.nextInt();
            inputReader.nextLine();
        
        
            if(rounds > 10 || rounds < 1) {
                System.out.println("Please try a valid number next time.");
            } else {
        
                for(int i = rounds; i > 0; i--){
                    System.out.println("Rock, paper, scissors shoot (choose one):");
                    player = inputReader.nextLine();
                    String npc = npc();
                    System.out.println(npc);
                    if (player.equals(npc)) {
                        System.out.println("This round is a tie.");
                        ties++;
                    } else if ((player.equals("rock") && npc.equals("scissors")) || 
                            (player.equals("scissors") && npc.equals("paper")) ||
                            (player.equals("paper") && npc.equals("rock"))) {
                        System.out.println("You won!");
                        playerScore++;
                    } else {
                        System.out.println("Ha, gotcha this time. I win.");
                        npcScore++;
                    }
                
                    System.out.println("");
                    System.out.println("Current Score:");
                    System.out.println("Player: " + playerScore);
                    System.out.println("Computer: " + npcScore);
                    System.out.println("Ties: " + ties);
                    System.out.println("");
                    System.out.println("-----------------------------");
                
                }
            
                if (playerScore == npcScore) {
                    System.out.println("It was a tie!!");
                    System.out.println(playerScore + " - " + npcScore);
                } else if (playerScore > npcScore) {
                    System.out.println("You win.. this time..");
                    System.out.println(playerScore + " - " + npcScore + " with " + ties + " ties.");
                } else {
                    System.out.println("I win!!");
                    System.out.println(playerScore + " - " + npcScore + " with " + ties + " ties.");
                }
            
                System.out.println("");
                System.out.println("Do you want to play again? (y/n)");
                again = inputReader.nextLine();
                if (again.equals("n")) {
                    System.out.println("Thanks for playing!!!");
                    y = false;
                }
                
                
            
            }
        } while (y == true);
    }
    
    public static String npc(){
        Random randomizer = new Random();
        String npcString;
        int npc = randomizer.nextInt(3) + 1;
        
        switch (npc) {
            case 1:
                npcString = "rock";
                break;
            case 2:
                npcString = "paper";
                break;
            default:
                npcString = "scissors";
                break;
        }
        return npcString;
    }
    
}
