/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author Tanner Kendall
 */
public class LovesMe {
    public static void main(String[] args) {
        
        int daisyPetals = 1;
        
        System.out.println("Well here goes nothing...");
        
         while (daisyPetals < 34) {
            
            if (daisyPetals % 2 == 0) {
                System.out.println("It LOVES me!");
            } else {
                System.out.println("It LOVES me NOT!");
            }
            
            daisyPetals++;
            
        }
        
        if (daisyPetals % 2 == 0) {
            System.out.println("I knew it! It LOVES ME!");
        } else {
            System.out.println("Darn, it doesn't love me..");
        }
        
    }
}
//I used a while loop becuase I knew the program will be running until we reach a certain value