/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.m1assessment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class DogGenetics {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        Random randomizer = new Random();
        
        String dogName;
        int remains = 101;
        int stBernard, chihuahua, pug, cur, doberman; 
        System.out.println("What is your dog's name?");
        dogName = inputReader.nextLine();
        System.out.println("Well then, I have this highly reliable"
                + " report on " + dogName + "'s prestigious background right here.");
        
        System.out.println(dogName + " is: ");
        System.out.println("");
        
        stBernard = randomizer.nextInt(21);
        System.out.println(stBernard + "% St. Bernard");
        
        chihuahua = randomizer.nextInt(21);
        System.out.println(chihuahua + "% Chihuahua");
        
        pug = randomizer.nextInt(21);
        System.out.println(pug + "% Dramatic RedNosed Asian Pug");
        
        cur = randomizer.nextInt(21);
        System.out.println(cur + "% Common Cur");
        
        doberman = 100 - (stBernard + chihuahua + pug + cur);
        System.out.println(doberman + "% Doberman");
        
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");
    }
    
    
    
}
