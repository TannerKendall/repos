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
public class InABucket {
    public static void main(String[] args) {
        
        // You can declare all kinds of variables
        String walrus;
        double piesEaten;
        float weightOfTeacupPig;
        int grainsOfSand;
        
        //declaring just sets up space for the data
        //to use the variable we need to put data in
        walrus = "Sir Leroy Jenkins III";
        piesEaten = 42.1;
        
        System.out.println("Meet my pet walrus, " + walrus);
        System.out.print("He was a bit hungry, and ate this many pies : ");
        System.out.println(piesEaten);
    }
}
