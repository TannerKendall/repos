/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class PickyEater {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.print("How many times had it been fried? (#)");
        int timesFried = Integer.parseInt(inputReader.nextLine());
        
        System.out.print("Does it have any spinach in it? (y/n) ");
        String hasSpinach = inputReader.nextLine();
        
        System.out.print("Is it covered in cheese? (y/n) ");
        String cheeseCovered = inputReader.nextLine();
        
        System.out.print("How many pats of butter are on top? (#)");
        int butterPats = Integer.parseInt(inputReader.nextLine());
        
        System.out.print("Is it covered in chocolate? (y/n) ");
        String chocolatedCovered = inputReader.nextLine();
        
        System.out.print("Does it have a funny name? (y/n) ");
        String funnyName = inputReader.nextLine();
        
        System.out.print("Is it brocoli? (y/n) ");
        String isBroccoli = inputReader.nextLine();
        
        //conditionals here
        
        if (hasSpinach.equals("y") || funnyName.equals("y")) {
            System.out.println("There's no way he'll eat that!");
        }
        
        
        
    }
}
