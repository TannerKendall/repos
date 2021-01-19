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
public class YourLifeInMovies {
    public static void main(String[] args) {
        
        String userName, stringYear;
        int year;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Hey, lets play a game! What's your name?");
        userName = inputReader.nextLine();
        
        System.out.println("Ok, " + userName + ", when were you born?");
        stringYear = inputReader.nextLine();
        year = Integer.parseInt(stringYear);
        
        if (year < 2005) {
            System.out.println("Did you know that Pixar's Up came out over a decade ago?");
        }
        
        if (year < 1995) {
            System.out.println("And that the first Harry Potter came out over 15 years ago?");
        }
        
        if (year < 1985) {
            System.out.println("Also, Space Jam came out in 1996!");
        }
        
        if (year < 1975) {
            System.out.println("The original Jurassic Park release is closer to the moon landing than it is to today!");
        }
        
        if (year < 1965) {
            System.out.println("the MASH TV series has been out for almost half a century!");
        }
        
    }
}
