/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class TwoForsAndTenYearsAgo {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("What year would you like to count back from? ");
        int year = inputReader.nextInt();
        
        for (int i = 0; i <= 10; i++){
            System.out.println(i + " years ago would be " + (year - i));
        }
        
        System.out.println("\nI can count backwards using a different way too...");
        
        for (int i = year; i >= year - 20; i--) {
            System.out.println((year - i) + " years ago would be " + i);
        }
        
    }
}
//The range for the first is 0-10
//Range for second is whatever the year is, and 10 years before