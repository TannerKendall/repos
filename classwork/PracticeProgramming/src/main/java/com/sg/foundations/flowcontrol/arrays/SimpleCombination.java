/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author Tanner Kendall
 */
public class SimpleCombination {
    public static void main(String[] args) {
        
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; //12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; //12 numbers
        
        int[] wholeNumbers = new int[24];
        
        for (int i = 0; i < firstHalf.length; i++) {
            wholeNumbers[i] = firstHalf[i];
        }
        
        for (int i = 0; i < secondHalf.length; i++) {
            for (int j = 12; j < wholeNumbers.length; j++) {
                wholeNumbers[j] = secondHalf[i++];
            }
        }
        
        System.out.println("All together now!");
        for (int k = 0; k < wholeNumbers.length; k++){
            System.out.print(wholeNumbers[k] + " ");
        }
    }
}
