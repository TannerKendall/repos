/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.scanner;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class BiggerBetterAdder {
    public static void main(String[] args){
        
        
        int number1, number2, number3, sum;
        String stringNumber1, stringNumber2, stringNumber3;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("Please enter the first number.");
        stringNumber1 = inputReader.nextLine();
        number1 = Integer.parseInt(stringNumber1);
        
        System.out.println("Please enter the second number.");
        stringNumber2 = inputReader.nextLine();
        number2 = Integer.parseInt(stringNumber2);
        
        System.out.println("Please enter the third number.");
        stringNumber3 = inputReader.nextLine();
        number3 = Integer.parseInt(stringNumber3);
        
        sum = number1 + number2 + number3;
        
        System.out.print(number1);
        System.out.print(" + ");
        System.out.print(number2);
        System.out.print(" + ");
        System.out.print(number3);
        System.out.print(" = ");
        System.out.print(sum);
        
        
    }
}
