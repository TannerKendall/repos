/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author Tanner Kendall
 */
public class SpringForwardFallBack {
    public static void main(String[] args) {
        
        System.out.println("It's Spring...!");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + ", ");
        }
        
        System.out.println("\nOh no, it's fall...");
        for (int i = 10; i > 0; i--) {
            System.out.print(i + ", ");
        }
        
    }
}
//start/stop for first is 0 and 9
//start/stop for second is 10 and 1
//to have same ranges, change first to i = 1; i <= 10;