/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Random;

/**
 *
 * @author Tanner Kendall
 */
public class LazyTeenager {
    public static void main(String[] args) {
        
     Random random = new Random();
     int chanceToClean = random.nextInt(11);
     int currentChance = 1;
     
     do {
         System.out.print("Clean your room!! (");
         System.out.println(currentChance + "0%)");
         
         if(currentChance == 7){
             System.out.println();
             System.out.println("That's IT, I'm doing it!!! YOU'RE GROUNDED AND I'M TAKING YOUR XBOX!");
             break;
         }
         
         currentChance++;
         
        } while (currentChance < chanceToClean);
     
        System.out.println("FINE! I'LL CLEAN MY ROOM. BUT I REFUSE TO EAT MY PEAS");
        
    }
}
