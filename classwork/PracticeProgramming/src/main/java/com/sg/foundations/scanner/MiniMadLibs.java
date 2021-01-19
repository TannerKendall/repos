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
public class MiniMadLibs {
    public static void main(String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        
        String nounOne, nounTwo, pluralNounOne, pluralNounTwo, pluralNounThree;
        String adjectiveOne, adjectiveTwo;
        String stringNumber;
        int number;
        String verbPresent, verbPast;
        
        System.out.println("Let's play MAD Libs");
        
        System.out.println("I need a noun: ");
        nounOne = inputReader.nextLine();
        
        System.out.println("Now an adjective: ");
        adjectiveOne = inputReader.nextLine();
        
        System.out.println("Another noun: ");
        nounTwo = inputReader.nextLine();
        
        System.out.println("And a number: ");
        stringNumber = inputReader.nextLine();
        number = Integer.parseInt(stringNumber);
        
        System.out.println("Another adjective: ");
        adjectiveTwo = inputReader.nextLine();
        
        System.out.println("A plural noun: ");
        pluralNounOne = inputReader.nextLine();
        
        System.out.println("Another one: ");
        pluralNounTwo = inputReader.nextLine();
        
        System.out.println("One More: ");
        pluralNounThree = inputReader.nextLine();
        
        System.out.println("A verb (infinitive form): ");
        verbPresent = inputReader.nextLine();
        
        System.out.println("Same verb (past participle): ");
        verbPast = inputReader.nextLine();
        
        System.out.println("***Now LETS GET MAD (libs)");
        
        System.out.print(nounOne);
        System.out.print(": the ");
        System.out.print(adjectiveOne);
        System.out.print(" frontier. These are the voyages of the starship ");
        System.out.print(nounTwo);
        System.out.print(". \n Its ");
        System.out.print(number);
        System.out.print("-year mission: to explore strange ");
        System.out.print(adjectiveTwo);
        System.out.print(" ");
        System.out.print(pluralNounOne);
        System.out.print(", to seek out \n");
        System.out.print(adjectiveTwo);
        System.out.print(" ");
        System.out.print(pluralNounTwo);
        System.out.print(" and ");
        System.out.print(adjectiveTwo);
        System.out.print(" ");
        System.out.print(pluralNounThree);
        System.out.print(", to boldly ");
        System.out.print(verbPresent);
        System.out.print(" where no one has ");
        System.out.print(verbPast);
        System.out.print(" before.");
        
    }
    
}
