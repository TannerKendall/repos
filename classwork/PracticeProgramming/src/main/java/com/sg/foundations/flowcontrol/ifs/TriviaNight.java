/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class TriviaNight {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int answer;
        int score = 0;
        
        System.out.println("It's TRIVIA NIGHT! Are you ready?!");
        
        System.out.println("FIRST QUESTION!");
        System.out.println("What year did Dark Souls release on consoles?");
        System.out.println("1) 2011     2) 2010");
        System.out.println("3) 2008     4) 2012");
        
        System.out.println("YOUR ANSWER: ");
        answer = inputReader.nextInt();
        System.out.println();
        
        if (answer == 1) {
            score++;
            System.out.println("That's correct!");
            System.out.println("Your current score is: " + score);
            System.out.println("2 questions remaining.");
            System.out.println();
        } else {
            System.out.println("Oof that is incorrect.");
            System.out.println("You have 2 questions remaining.");
            System.out.println();
        }
        
        System.out.println("SECOND QUESTION!");
        System.out.println("Which item will transport player to last visited bonfire?");
        System.out.println("1) Estus Flask     2) Bloodred Moss Clump");
        System.out.println("3) Homeward Bone     4) Purging Stone");
        
        System.out.println("YOUR ANSWER: ");
        answer = inputReader.nextInt();
        System.out.println();
        
        if (answer == 3) {
            score++;
            System.out.println("That's correct!");
            System.out.println("Your current score is: " + score);
            System.out.println("1 question remaining.");
            System.out.println();
        } else {
            System.out.println("Oof that is incorrect.");
            System.out.println("You have 1 question remaining.");
            System.out.println();
        }
        
        System.out.println("LAST QUESTION!");
        System.out.println("Who is the final boss in Dark Souls?");
        System.out.println("1) Gwyn     2) Vordt");
        System.out.println("3) Asylum Demon     4) Sif");
        
        System.out.println("YOUR ANSWER: ");
        answer = inputReader.nextInt();
        System.out.println();
        
        if (answer == 1) {
            score++;
            System.out.println("That's correct!");
            System.out.println();
        } else {
            System.out.println("Oof that is incorrect.");
            System.out.println();
        }
        
        switch (score) {
            case 0: 
                System.out.println("Yikes, you missed every question.");
                break;
            case 1:
                System.out.println("You can do better. You got " + score + " correct.");
                break;
            case 2:
                System.out.println("Not bad, you got " + score + " questions correct.");
                break;
            case 3:
                System.out.println("You answered all questions correctly!");
                break;
        }
        
    }
}
