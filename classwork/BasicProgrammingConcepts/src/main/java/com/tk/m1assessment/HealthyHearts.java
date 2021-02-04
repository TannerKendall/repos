/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.m1assessment;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class HealthyHearts {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int age, maxHeartRate;
        double targetRateLow, targetRateHigh;
        
        System.out.println("What is your age? ");
        age = inputReader.nextInt();
        System.out.println();
        
        maxHeartRate = 220 - age;
        targetRateLow = Math.ceil(maxHeartRate * .5);
        targetRateHigh = Math.ceil(maxHeartRate * .85);
        
        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute");
        
        
        System.out.print("Your target HR Zone is ");
        System.out.print(targetRateLow);
        System.out.print(" - ");
        System.out.print(targetRateHigh);
        System.out.print(" beats per minute.");
        
    }
}
