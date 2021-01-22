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
public class ForTimesFor {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        int answer, userAnswer;
        
        System.out.println("Which times table shall I recite?");
        int userNumber = inputReader.nextInt();
        
        for (int i = 1; i <= 15; i++) {
            answer = i * userNumber;
            System.out.println(i + " * " + userNumber + " is: ");
            userAnswer = inputReader.nextInt();
            
            if (userAnswer == answer) {
                
                System.out.println("Correct!");
                
            } else {
                System.out.println("Sorry no, the answer is: " + answer);
            }
        }
        
    }
}
