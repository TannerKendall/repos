/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.simplecalculator;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class App {
    public static void main(String[] args) {
        
        SimpleCalculator calc = new SimpleCalculator();
        Scanner inputReader = new Scanner(System.in);
        double x, y;
        int operation;
        double solution;
        String keepGoing;
        boolean exit = true;
        
        System.out.println("---Welcome to a Simple Calculator---");
        System.out.println("");
        
        while (exit == true) {
            System.out.println("Please select an operation type..");
            System.out.println("1 = Addition");
            System.out.println("2 = Subtraction");
            System.out.println("3 = Multiplication");
            System.out.println("4 = Division");
            System.out.println("5 = Exit.");
            System.out.println("");
            operation = inputReader.nextInt();
            inputReader.nextLine();
            
            switch (operation) {
                case 5:
                    System.out.println("Thanks for using the calculator.");
                    exit = false;
                    break;
                case 1:
                    System.out.println("Please enter the first operand:");
                    x = inputReader.nextDouble();
                    System.out.println("Please enter the second operand:");
                    y = inputReader.nextDouble();
                    solution = calc.add(x, y);
                    System.out.println("The solution is: " + solution);
                    break;
                case 2:
                    System.out.println("Please enter the first operand:");
                    x = inputReader.nextDouble();
                    System.out.println("Please enter the second operand:");
                    y = inputReader.nextDouble();
                    solution = calc.subtract(x, y);
                    System.out.println("The solution is: " + solution);
                    break;
                case 3:
                    System.out.println("Please enter the first operand:");
                    x = inputReader.nextDouble();
                    System.out.println("Please enter the second operand:");
                    y = inputReader.nextDouble();
                    solution = calc.multiply(x, y);
                    System.out.println("The solution is: " + solution);
                    break;
                case 4:
                    System.out.println("Please enter the first operand:");
                    x = inputReader.nextDouble();
                    System.out.println("Please enter the second operand:");
                    y = inputReader.nextDouble();
                    solution = calc.divide(x, y);
                    System.out.println("The solution is: " + solution);
                    break;
                default:
                    System.out.println("Please enter a valid choice next time..");
                    break;
            }
            
            inputReader.nextLine();
            System.out.println("");
            System.out.println("Would you like to use the calculator again? (y/n)");
            keepGoing = inputReader.nextLine();
            if (keepGoing.equals("n")) {
                System.out.println("Thanks for using the calculator.");
                exit = false;
            }
            
            
        }
        
        
    }
}
