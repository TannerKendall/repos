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
        
        stBernard = randomizer.nextInt(remains);
        System.out.println(stBernard + "% St. Bernard");
        //remains = remains - stBernard;
        
        chihuahua = randomizer.nextInt(remains - stBernard);
        System.out.println(chihuahua + "% Chihuahua");
        //remains = remains - chihuahua;
        
        pug = randomizer.nextInt(remains - (stBernard + chihuahua));
        System.out.println(pug + "% Dramatic RedNosed Asian Pug");
        //remains = remains - pug;
        
        cur = randomizer.nextInt(remains - (stBernard + chihuahua + pug));
        System.out.println(cur + "% Common Cur");
        //remains = remains - cur;
        
        doberman = randomizer.nextInt(remains - (stBernard + chihuahua + pug + cur));
        System.out.println(doberman + "% Doberman");
        
        System.out.println("");
        System.out.println("Wow, that's QUITE the dog!");
    }
    
    
    
}
