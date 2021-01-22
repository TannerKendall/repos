/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.random;

import java.util.Random;

/**
 *
 * @author Tanner Kendall
 */
public class CoinFlipper {
    public static void main(String[] args) {
        
        
        Random coinFlip = new Random();
        
        
        System.out.println("Ready, Set, Flip....!!");
        
        Boolean result = coinFlip.nextBoolean();
        
        System.out.print("You got: ");
        
        if (result == true) {
            System.out.println("HEADS!");
        } else {
            System.out.println("TAILS");
        }
        
    }
}
