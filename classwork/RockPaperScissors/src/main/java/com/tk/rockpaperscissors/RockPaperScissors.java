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
    public void RPS() {
        
        Scanner inputReader = new Scanner(System.in);
        
        int rounds;
        int playerMove = 0;
        String player;
        String npcString;
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
                    if (player.equalsIgnoreCase("rock")){
                        playerMove = 1;
                    } else if(player.equalsIgnoreCase("paper")) {
                        playerMove = 2;
                    } else if(player.equalsIgnoreCase("scissors")) {
                        playerMove = 3;
                    } else {
                        System.out.println("Please enter a valid move next time..");
                    }
                    int npc = npc();
                    
                    switch (npc) {
                        case 1:
                            npcString = "Rock";
                            break;
                        case 2:
                            npcString = "Paper";
                            break;
                        default:
                            npcString = "Scissors";
                            break;
                    }
                    
                    System.out.println(npcString);
                    if (playerMove == npc) {
                        System.out.println("This round is a tie.");
                        ties++;
                    } else if ((playerMove == 1 && npc == 3) || 
                            (playerMove == 2 && npc == 1) ||
                            (playerMove == 3 && npc == 2)) {
                        System.out.println("You won!");
                        playerScore++;
                    } else if (playerMove == 0) {
                        System.out.println("You didn't enter a valid move, I win by default.");
                        npcScore++;
                    }else {
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
    
    public static int npc(){
        Random randomizer = new Random();
        int npcInt = randomizer.nextInt(3) + 1;
        
        return npcInt;
    }
    
}

