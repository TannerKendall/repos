/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.interestcalculator;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class interestCalculator {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("How much do you want to invest?");
        double principal = inputReader.nextDouble();
        System.out.println("How many years are you investing?");
        int time = inputReader.nextInt();
        System.out.println("What is the annual interest rate % growth?");
        double rate = inputReader.nextDouble();
        
        double currentBalance = principal;
        double startedWith = principal;
        for(int i = 1; i <= time; i++) {
            //double totalAmount1 = (principal * ((rate / 100) / 4)) + principal;
            //double totalAmount2 = (totalAmount1 * ((rate / 100) / 4)) + totalAmount1;
            //double totalAmount3 = (totalAmount2 * ((rate / 100) / 4)) + totalAmount2;
            //double totalAmount4 = (totalAmount3 * ((rate / 100) / 4)) + totalAmount3;
            //double earned = totalAmount4 - principal;
            
            System.out.println("Year " + i + ":");
            System.out.println("Began with: " + startedWith);
            
            currentBalance = (startedWith * ((rate / 100) / 4)) + startedWith;
            currentBalance = (currentBalance * ((rate / 100) / 4)) + currentBalance;
            currentBalance = (currentBalance * ((rate / 100) / 4)) + currentBalance;
            double totalAmount = (currentBalance * ((rate / 100) / 4)) + currentBalance;
            double earned = totalAmount - startedWith;
            startedWith = totalAmount;
            
            //System.out.println("Year " + i + ":");
            //System.out.println("Began with: " + currentBalance);
            System.out.println("Earned: " + earned);
            System.out.println("Ended with: " + totalAmount);
            System.out.println("");
        }
    
    }
        
}
