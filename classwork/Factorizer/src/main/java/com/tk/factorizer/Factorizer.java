/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.factorizer;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class Factorizer {
    public void Factorize() {
    
        Scanner inputReader = new Scanner(System.in);
        int userNumber;
        int numOfFactors = 0;
        int sum;
        System.out.println("Please enter a whole number to factor:");
        userNumber = inputReader.nextInt();
        System.out.println("The factors of " + userNumber + " are: ");
        
        for (int i = 1; i <= userNumber; i++) {
            if (userNumber % i == 0) {
                System.out.print(i + " ");
                numOfFactors++;
            }
            
        }
        System.out.println("");
        System.out.println(userNumber + " has " + numOfFactors + " factors.");
        
        sum = isPerfect(userNumber);
        
        if (sum == userNumber) {
            System.out.println(userNumber + " is a perfect number");
        } else {
            System.out.println(userNumber + " is not a perfect number");
        }
        
        if (isPrime(userNumber) == true) {
            System.out.println(userNumber + " is a prime number.");
        } else {
            System.out.println(userNumber + " is not a prime number.");
        }
        
        
    }

    public static boolean isPrime(int userNumber) {
        boolean prime;
        
        if (userNumber == 2){
            prime = true;
            return prime;
        } else if (userNumber % 2 == 0) {
            prime = false;
            return prime;
        } else {
            prime = true;
            return prime;
        } 
    }
    
    public static int isPerfect(int userNumber) {
        
        int sum = 0;
        boolean perfect;
        for (int i = 1; i < userNumber; i++) {
            if (userNumber % i == 0) {
                sum = sum + i;
            }
        }
        
        return sum;
    }
    
}