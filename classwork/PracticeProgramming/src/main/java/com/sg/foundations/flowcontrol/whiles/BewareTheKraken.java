/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class BewareTheKraken {
    public static void main(String[] args) {
       
       Scanner inputReader = new Scanner(System.in); 
        
       System.out.println("Already, get those flippers and wetsuit on - we're going diving!" ); 
       System.out.println("Here we gooooOOOOooOooo.....! *SPLASH*");
       
       
       int depthDivedFeet = 0;
       String stop;
       String fish[] = {"Salmon", "Tuna", "Shark"};
       int i; //array index
       //reach bottom at 36200
       
       while (depthDivedFeet < 36200) {
       //while (true) {
           System.out.println("So far, we've swum " + depthDivedFeet + " feet");
           i = new Random().nextInt(fish.length);
           
           
           if(depthDivedFeet >= 20000) {
               System.out.println("uhhh, I think I see a Kraken guys .... ");
               System.out.println("TIME TO GO!");
               break;
           }
           
           System.out.println("Do you want to stop? (y/n)");
           stop = inputReader.nextLine();
           if (stop.equals("y")) {
               break;
           } else {
                System.out.println("Look! A fish! It's a " + fish[i]);
           }
           
           //swim 500ft at a time
           depthDivedFeet += 1000;
       }
       System.out.println("");
       System.out.println("We ended up swimming " + depthDivedFeet + " feet down.");
       System.out.println("I bet we can do better next time!");
       
    }
}
//changing loop condition to true, makes opposite reults happen 