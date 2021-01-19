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
public class DoItBetter {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int miles, hotDog, language, milesSum, hotDogSum, languageSum;
        
        System.out.println("How many miles can you run? ");
        miles = inputReader.nextInt();
        System.out.println();
        milesSum = miles * 2 + 1;
        System.out.println("Ha! I can run " + milesSum + "!");
        System.out.println();
        
        System.out.println("How many hot dogs can you eat? ");
        hotDog = inputReader.nextInt();
        System.out.println();
        hotDogSum = hotDog * 2 + 1;
        System.out.println("Ha! I can eat " + hotDogSum + "!");
        System.out.println();
        
        System.out.println("How many languages do you know? ");
        language = inputReader.nextInt();
        System.out.println();
        languageSum = language * 2 + 1;
        System.out.println("Ha! I know " + languageSum + "!");
        
        
    }
}
