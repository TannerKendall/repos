/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class StayPositive {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        
        int countDown;
        int perLine = 0;
        
       System.out.println("What number should I count down from: ");
         countDown = inputReader.nextInt();
        
       while (countDown < 0) {
         System.out.println("Please enter a positive number: ");
         countDown = inputReader.nextInt();  
       }
       
        System.out.println("Counting down...");
        
        while (countDown >= 0) {
            
            if (perLine < 10) {
                perLine++;
            } else {
                System.out.print("\n");
                perLine = 1;
            }
            
            System.out.print(countDown + " ");
            countDown--;
        }
        System.out.println();
        System.out.println("Blast off!");
        
    }
}
