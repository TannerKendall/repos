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
public class PassingTheTuringTest {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String name, color, food;
        int favNumber;
        
        System.out.print("Hello There!" + "\n");
        System.out.println("What's your name? ");
        name = inputReader.nextLine();
        System.out.print("Hi, " + name + "! I'm GLaDOS.\n");
        
        System.out.println("What's your favorite color? ");
        color = inputReader.nextLine();
        System.out.println("Huh, " + color + "? Mine's green.");
        
        System.out.println("I really like limes. They're my favorite fruit, too. ");
        System.out.println("What's your favorite food, " + name + "? ");
        food = inputReader.nextLine();
        System.out.println("Really? " + food + "? That's Wild!");
        
        System.out.println("Speaking of favorites, what's your favorite number?");
        favNumber = inputReader.nextInt();
        System.out.println(favNumber + " is a cool number. mine is -7.");
        int product = favNumber * -7;
        System.out.print("Did you know ");
        System.out.print(favNumber);
        System.out.print(" * -7 is ");
        System.out.print(product);
        System.out.println(" That's a cool number too!");
        
        System.out.println("Well, thanks for talking to me, " + name);
        
        
        
    }
}
