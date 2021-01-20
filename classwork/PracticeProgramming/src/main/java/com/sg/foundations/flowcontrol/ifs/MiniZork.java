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
public class MiniZork {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
        
        System.out.println("You are standing in an open field west of a white house.");
        System.out.println("With a boarded front door.");
        System.out.println("To your east, there is a barn.");
        System.out.println("There is a small mailbox where you are now.");
        System.out.println("Go to the house, barn, or open the mailbox? ");
        
        String action = inputReader.nextLine();
        
        if(action.equalsIgnoreCase("open the mailbox")){
            System.out.println("You open the mailbox.");
            System.out.println("It's really dark in there.");
            System.out.println("Look inside or stick your hand in?");
            
            action = inputReader.nextLine();
            
            if(action.equalsIgnoreCase("look inside")){
                System.out.println("You peer inside the mailbox.");
                System.out.println("It's really very dark. So ... so very dark.");
                System.out.println("Run away or keep looking? ");
                
                action = inputReader.nextLine();
                
                if(action.equalsIgnoreCase("keep looking")){
                    System.out.println("Turns out, hanging out around dark places isn't a good idea.");
                    System.out.println("You've been eaten by a grue.");
                } else if(action.equalsIgnoreCase("run away")) {
                    System.out.println("You run away screaming across the fields - looking very foolish.");
                    System.out.println("But you're alive! Possibly a wise choice");
                }
            } else if (action.equalsIgnoreCase("stick your hand in")) {
                System.out.println("You stick your hand in the mail box.");
                System.out.println("Something grabs you and pulls you into an infinite darkness.");
            }
        } else if (action.equalsIgnoreCase("go to the house")) {
            System.out.println("You arrive at the white house.");
            System.out.println("It's eerily quiet.");
            System.out.println("Do you knock, peek in the window, or return to the field?");
            action = inputReader.nextLine();
            
            if(action.equalsIgnoreCase("knock")){
                System.out.println("The door swings open. There stands a human, or is it?");
                System.out.println("Oh! you're the one I've been looking for.. please come in.");
                System.out.println("... after a dinner and a good nights rest, our friend give's us the coordinates to the next location on the road to the grail.");
            } else if(action.equalsIgnoreCase("peek in the window")) {
                System.out.println("You immediately lock eyes with a humanoid creature. He sprints to the door..");
                System.out.println("Next thing you know, you are being eaten alive. 'Shouldn't be lookin in nobody's windows like that ya hear?'..");
                System.out.println("You begin to fall into a deep and infinite slumber.");
            } else if(action.equalsIgnoreCase("return to the field")) {
                System.out.println("You return to the field.");
            }
                
        } else if (action.equalsIgnoreCase("go to the barn")) {
                System.out.println("You come to a big red barn.");
                System.out.println("You see a couple of chickens, but what really catches your eye is the massive horse in the barn.");
                System.out.println("Will you hop on the horse, watch the chickens, or head to the house? ");
                action = inputReader.nextLine();
            
                if(action.equalsIgnoreCase("hop on the horse")){
                    System.out.println("You pet the horse, it seems to know you.. maybe not in this life but another.");
                    System.out.println("The horse nods, and you jump on it's back.");
                    System.out.println("The horse know exactly where to take you, the final leg of your journey.");
                } else if (action.equalsIgnoreCase("watch the chickens")) {
                    System.out.println("You stand and watch the chickens..");
                    System.out.println("There isn't much exciting about the chickens."); 
                } else if (action.equalsIgnoreCase("return to the field")) {
                    System.out.println("You return to the field.");
                }
        }
    }
}

