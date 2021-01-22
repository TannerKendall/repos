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
public class MaybeItLovesMe {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        int daisyPetals;
        int loopCount = 1;
        
        daisyPetals = randomizer.nextInt(89 - 13) + 13;
        
        System.out.println("Well here goes nothing...");
        System.out.println(daisyPetals);
         while (loopCount <= daisyPetals) {
            
            if (loopCount % 2 == 0) {
                System.out.println("It LOVES me!");
            } else {
                System.out.println("It LOVES me NOT!");
            }
            
            loopCount++;
            
        }
        
        loopCount--;
        
        if (loopCount % 2 == 0) {
            System.out.println("I knew it! It LOVES ME!");
        } else {
            System.out.println("Darn, it doesn't love me..");
        }
    }
}
