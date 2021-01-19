/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class GuessMe {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int myNumber = 25;
        int userNumber;
        
        System.out.println("I've chosen a number. Betcha can't guess it!");
        System.out.println("Your guess: ");
        String userNumberString = sc.nextLine();
        userNumber = Integer.parseInt(userNumberString);
        
        if (userNumber == myNumber) {
            System.out.println(userNumber + ", Wow spot on! Congrats!");
        }
        
        if (userNumber < myNumber) {
            System.out.println(userNumber + ", oof, that's a little low there partner.");
        }
        
        if (userNumber > myNumber) {
            System.out.println(userNumber + ", yikes, aim a little lower there buddy.");
        }
        
        
        
    }
}
