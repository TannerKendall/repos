/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class RollerCoaster {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("We're going to go on a roller coaster...");
        System.out.println("Let me know when you want to get off..!");
        
        String keepRiding = "y";
        int loopsLooped = 0;
        
        while (keepRiding.equals("y")) {
            System.out.println("WHEEEEEEEEEEEEEEeEEeeEEE....!!!");
            System.out.println("Want to keep going? (y/n): ");
            keepRiding = inputReader.nextLine();
            loopsLooped++;
        }
        
        System.out.println("Wow, that was FUN!");
        System.out.println("We looped that loop " + loopsLooped + " times!");
        
    }
}
//if the user enters a value other than y or n, the loop only
// runs once and we move straight to the end of the program
//if you change condition to check for a no, loop never runs and go straight to end 