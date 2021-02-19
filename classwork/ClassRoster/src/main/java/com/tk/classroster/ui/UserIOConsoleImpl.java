/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classroster.ui;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class UserIOConsoleImpl implements UserIO {
    Scanner inputReader = new Scanner(System.in);
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return inputReader.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        int userInt;
        System.out.println(prompt);
        userInt = inputReader.nextInt();
        inputReader.nextLine();
        return userInt;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        int userInt;
        boolean works = true;
        System.out.println(prompt);
        userInt = inputReader.nextInt();
        inputReader.nextLine();
        
        while(works) {
            if (userInt >= min && userInt <= max) {
                works = false;
            } else {
            System.out.println("Please enter value between " + min + " and " + max);
            userInt = inputReader.nextInt();
            inputReader.nextLine();
            }
        }
        return userInt;
    }

    @Override
    public double readDouble(String prompt) {
        double userDouble;
        System.out.println(prompt);
        userDouble = inputReader.nextDouble();
        inputReader.nextLine();
        return userDouble;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        double userDouble;
        boolean works = true;
        System.out.println(prompt);
        userDouble = inputReader.nextDouble();
        inputReader.nextLine();
        
        while(works) {
            if (userDouble >= min && userDouble <= max) {
                works = false;
            } else {
            System.out.println("Please enter value between " + min + " and " + max);
            userDouble = inputReader.nextInt();
            inputReader.nextLine();
            }
        }
        return userDouble;
    }

    @Override
    public float readFloat(String prompt) {
        float userFloat;
        System.out.println(prompt);
        userFloat = inputReader.nextFloat();
        inputReader.nextLine();
        return userFloat;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        float userFloat;
        boolean works = true;
        System.out.println(prompt);
        userFloat = inputReader.nextInt();
        inputReader.nextLine();
        
        while(works) {
            if (userFloat >= min && userFloat <= max) {
                works = false;
            } else {
            System.out.println("Please enter value between " + min + " and " + max);
            userFloat = inputReader.nextFloat();
            inputReader.nextLine();
            }
        }
        return userFloat;
    }

    @Override
    public long readLong(String prompt) {
        long userLong;
        System.out.println(prompt);
        userLong = inputReader.nextLong();
        inputReader.nextLong();
        return userLong;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        long userLong;
        boolean works = true;
        System.out.println(prompt);
        userLong = inputReader.nextInt();
        inputReader.nextLine();
        
        while(works) {
            if (userLong >= min && userLong <= max) {
                works = false;
            } else {
            System.out.println("Please enter value between " + min + " and " + max);
            userLong = inputReader.nextInt();
            inputReader.nextLine();
            }
        }
        return userLong;
    }

}
