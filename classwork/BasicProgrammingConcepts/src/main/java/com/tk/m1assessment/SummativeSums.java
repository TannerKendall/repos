/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.m1assessment;

/**
 *
 * @author Tanner Kendall
 */
public class SummativeSums {
    public static void main(String[] args) {
        int[] numbers1 = {1, 90, -33, -55, 67, -16, 28, -55, 15};
        int[] numbers2 = {999, -60, -77, 14, 160, 301};
        int[] numbers3 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 
            120, 130, 140, 150, 160, 170, 180, 190, 200, -99};
        
        System.out.println("#1 Array Sum: " + summativeSums(numbers1));
        System.out.println("#2 Array Sum: " + summativeSums(numbers2));
        System.out.println("#3 Array Sum: " + summativeSums(numbers3));
    
    }
    
    public static int summativeSums(int newNumbers[]){
        int sum = 0;
        
        for (int i = 0; i < newNumbers.length; i++){
            sum += newNumbers[i];
        }
        
        return sum;
    }
    
    
}
