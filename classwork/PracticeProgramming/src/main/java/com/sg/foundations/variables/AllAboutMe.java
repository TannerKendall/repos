/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Tanner Kendall
 */
public class AllAboutMe {
    public static void main(String[] args) {
        
        String name, favoriteFood, livingSituation;
        int numberOfPets;
        boolean whistle;
        
        name = "Tanner Kendall";
        favoriteFood = "tacos";
        livingSituation = "apartment";
        numberOfPets = 2;
        whistle = true;
        
        System.out.println("My name is " + name + ".");
        System.out.println("My favorite food is " + favoriteFood + ".");
        System.out.println("I have " + numberOfPets + " pets.");
        System.out.println("I live in an " + livingSituation + ".");
        System.out.println("It is " + whistle + " I know how to whistle.");
        
    }
}
