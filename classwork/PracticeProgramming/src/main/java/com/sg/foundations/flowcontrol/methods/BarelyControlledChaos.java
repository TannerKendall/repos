/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.methods;

import java.util.Random;

/**
 *
 * @author Tanner Kendall
 */
public class BarelyControlledChaos {
    public static void main(String[] args) {
        
        String color = randomColor();
        String animal = randomAnimal();
        String colorAgain = randomColor();
        int weight = randomNumber(200, 5);
        int distance = randomNumber(20, 10);
        int number = randomNumber(20000, 10000);
        int time = randomNumber(6, 2);
        
        System.out.println("Once, when I was very small...");
        System.out.println("I was chased by a " + color + ", " + weight + "lb " + " miniature " + animal + " for over " + distance + " miles!!");
        System.out.println("I had to hide in a field of over " + number + " " + colorAgain + 
                " poppies for nearly " + time + " hours until it left me alone!");
        System.out.println("\nIt was QUITE the experience, " + "let me tell you!");
        
    }
    
    public static String randomColor() {
        Random randomizer = new Random();
        int i = randomizer.nextInt(5);
        String randomColor = null;
        
        switch (i) {
            case 0:
                randomColor = "blue";
                break;
            case 1:
                randomColor = "red";
                break;
            case 2:
                randomColor = "green";
                break;
            case 3:
                randomColor = "purple";
                break;
            case 4:
                randomColor = "brown";
                break;
            case 5:
                randomColor = "black";
                break;
        }
        return randomColor;
    }
    
    public static String randomAnimal() {
        Random randomizer = new Random();
        int i = randomizer.nextInt(5);
        String randomAnimal = null;
        
        switch (i) {
            case 0:
                randomAnimal = "giraffe";
                break;
            case 1:
                randomAnimal = "puppy";
                break;
            case 2:
                randomAnimal = "shark";
                break;
            case 3:
                randomAnimal = "eagle";
                break;
            case 4:
                randomAnimal = "llama";
                break;
            case 5:
                randomAnimal = "alligator";
                break;
        }
        return randomAnimal;
    }
    
    public static int randomNumber(int a, int b) {
        Random randomizer = new Random();
        int num;
        if (a > b) {
            num = randomizer.nextInt((a - b) + b);
        } else {
            num = randomizer.nextInt((b - a) + a);
        }
        return num;
    }
    
}