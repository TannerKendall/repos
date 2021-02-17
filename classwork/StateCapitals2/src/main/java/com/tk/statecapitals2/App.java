/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.statecapitals2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Tanner Kendall
 */
public class App {
    public static void main(String[] args) throws Exception {
        
        Random randomizer = new Random();
        Scanner inputReader = new Scanner(new BufferedReader(new FileReader("StateCapitals.txt")));
        Map<String, String> stateCapitals = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        
        while (inputReader.hasNextLine()) {
            String[] columns = inputReader.nextLine().split("::");
            stateCapitals.put(columns[0], columns[1]);
        }
        
        System.out.println(stateCapitals.size() + " STATES AND CAPITALS ARE LOADED.");
        System.out.println("======");
        
        System.out.println("HERE ARE THE STATES : ");
        
        Set<String> states = stateCapitals.keySet();
        
        for(String currentState : states) {
            System.out.print(currentState + ", ");
        }
        
        
        int n = states.size();
        List<String> listOfStates = new ArrayList<>(n);
        
        for (String x : states) {
            listOfStates.add(x);
        }
        
        System.out.println("");
        
        System.out.println("How many states would you like to guess?");
        int tries = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("READY TO TEST YOUR KNOWLEDGE? WHAT IS THE CAPITAL OF THE FOLLOWING STATES?");
        int correct = 0;
        
        for(int i = 0; i < tries; i++) {
            int index = randomizer.nextInt(listOfStates.size());
            String randomState = listOfStates.get(index);
            System.out.println(randomState + "?");
            String guess = scanner.nextLine();
            
            if (guess.equalsIgnoreCase(stateCapitals.get(randomState))) {
                System.out.println("You got it correct!! " + guess + " is the capital of " + randomState);
                correct++;
            } else {
                System.out.println(guess + " is not the capital of " + randomState);
                correct--;
            }
            
        }
        
        System.out.println("Thanks for playing, you got " + correct + " states correct.");
        
        
        
        
        
    }
}
