/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.whiles;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class DoOrDoNot {
    public static void main(String[] args){
        
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Should I do it? (y/n)");
        boolean doIt;

        if (inputReader.next().equals("y")) {
            doIt = true; //DO IT
        } else {
            doIt = false; //Don't do it
        }
        
        boolean iDidIt = false;
        
        //do {
        //    iDidIt = true;
        //    break;
        //} while (doIt);
        
        while (doIt) {
            iDidIt=true;
        }
        
        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
                
                
    }
}
//entering y, prints out I did it!
//entering n, prints out "I know you said not to... but I totally did anyways."
//with just while loop, nothing prints out as it can't break out of the loop
//when you tell it not to, iDidIt reamains false and this prints: "Don't look at me, I didn't do anything!"