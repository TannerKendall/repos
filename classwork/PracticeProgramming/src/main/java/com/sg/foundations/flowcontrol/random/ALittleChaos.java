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
public class ALittleChaos {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Random can make integers : " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());
        
        int num = randomizer.nextInt(100);
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);
        
        System.out.println("Or just keep generating new values");
        
        //changing randomizer.Next(101) to randomizer.Next(51) + 50
        //makes values from 50-100
        System.out.println("Here's a bunch of numbers from 50 - 100: ");
        
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(51) + 50 + ", ");
        System.out.print(randomizer.nextInt(51) + 50);
        System.out.println();
        
        //random numbers in a math statement.
        
        System.out.println(47 * randomizer.nextInt(101));
        
        //different number types
        
        System.out.println(5 * randomizer.nextDouble());
        System.out.println(12 + randomizer.nextFloat());
    }
}
