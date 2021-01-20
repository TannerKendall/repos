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
public class FieldDay {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        String userName;
        String baggins = "baggins";
        String dresden = "dresden";
        String howl = "howl";
        String potter = "potter";
        String vimes = "vimes";
        
        System.out.println("What's your name?");
        userName = inputReader.nextLine();
        
        if (userName.compareToIgnoreCase(baggins) < 0) {
            System.out.println("Aha! You're on the team 'Red Dragons'!");
        } else if (userName.compareToIgnoreCase(baggins) > 0 && userName.compareToIgnoreCase(dresden) <0) {
            System.out.println("Aha! you're on the team 'Dark Wizards'!");
        } else if (userName.compareToIgnoreCase(dresden) > 0 && userName.compareToIgnoreCase(howl) <0) {
            System.out.println("Aha! you're on the team 'Moving Castles'!");
        } else if (userName.compareToIgnoreCase(howl) > 0 && userName.compareToIgnoreCase(potter) <0) {
            System.out.println("Aha! you're on the team 'Golden Snitches'!");
        } else if (userName.compareToIgnoreCase(potter) > 0 && userName.compareToIgnoreCase(vimes) <0) {
            System.out.println("Aha! you're on the team 'Night Guards'!");
        } else {
            System.out.println("Aha! You're on the team 'Black Holes'!");
        }
        
        System.out.println("Good luck in the games!");
    }
}
