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
public class TheCount {
    public static void main(String[] args) {
        
        int start, stop, count;
        int n = 0;
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("*** I LOVE TO COUNT! LET ME SHARE MY COUNTING WITH YOU! ***");
        System.out.println("Start at: ");
        start = inputReader.nextInt();
        System.out.println("Stop at: ");
        stop = inputReader.nextInt();
        System.out.println("Count by: ");
        count = inputReader.nextInt();
        
        for (int i = start; i <= stop; i = i + count) {
            System.out.print(i + " ");
            n++;
            if (n == 3) {
                System.out.println(" - Ah ah ah!");
                n = 0;
            }
            
        }
        
    }
}
