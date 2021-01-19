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
public class AllTheTrivia {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String answerOne, answerTwo, answerThree, answerFour;
        
        
        System.out.println("What unit is equivalent to 1,024 Gigabytes? ");
        answerOne = inputReader.nextLine();
        
        System.out.println("Which planet is the only one that rotates clockwise in our Solar System? ");
        answerTwo = inputReader.nextLine();
        
        System.out.println("The largest volcano ever discovered in out Solar System is located on which planet? ");
        answerThree = inputReader.nextLine();
        
        System.out.println("What is the most abundant element in earth's atmosphere? ");
        answerFour = inputReader.nextLine();
        
        System.out.println("Wow, 1,024 Gigabytes is a " + answerThree );
        System.out.print("I didn't know that the largest ever volcano was discovered on ");
        System.out.println(answerOne + "!");
        System.out.println("That's amazing that " + answerTwo + " is the most abundant element in the atmosphere...");
        System.out.println(answerFour + " is the only planet that rotates clockwise, neat!");
        
    }
}
