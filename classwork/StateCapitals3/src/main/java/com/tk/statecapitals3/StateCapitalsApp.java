/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.statecapitals3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Tanner Kendall
 */
public class StateCapitalsApp {
    
    public static void main(String[] args) throws Exception {
        
        Scanner fileReader = new Scanner(new BufferedReader(new FileReader("MoreStateCapitals.txt")));
        Map<String, Capital> stateCapitals = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        while (fileReader.hasNextLine()) {
            String[] columns = fileReader.nextLine().split("::");
            stateCapitals.put(columns[0], new Capital(columns[1], Integer.parseInt(columns[2]), Double.parseDouble(columns[3])));
        }
        
        System.out.println(stateCapitals.size() + " STATE/CAPITAL PAIRS LOADED.");
        System.out.println("==============================");
        
        Set<String> states = stateCapitals.keySet();
        
        for(String currentState : states){
            System.out.println(currentState + " - " + stateCapitals.get(currentState).getName() + 
                    " | Pop: " + stateCapitals.get(currentState).getPopulation() + " | Area: " + 
                    stateCapitals.get(currentState).getSquareMileage() + " sq mi");
        }
        
        System.out.println("");
        System.out.println("===================================");
        System.out.println("");
        System.out.println("Please enter the population limit (limit as in lowest): ");
        int limit = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("LISTING ALL CAPITALS WITH POPULATIONS GREATER THAN " + limit);
        
        for (String currentState : states) {
            if(stateCapitals.get(currentState).getPopulation() > limit){
                System.out.println(currentState + " - " + stateCapitals.get(currentState).getName() + 
                    " | Pop: " + stateCapitals.get(currentState).getPopulation() + " | Area: " + 
                    stateCapitals.get(currentState).getSquareMileage() + " sq mi");
            }
        }
        
        System.out.println("");
        System.out.println("===================================");
        System.out.println("");
        System.out.println("Please enter the Area limit (limit as in highest): ");
        int areaLimit = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("LISTING ALL CAPITALS WITH AREAS LOWER THAN " + areaLimit);
        
        for (String currentState : states) {
            if(stateCapitals.get(currentState).getSquareMileage() < areaLimit){
                System.out.println(currentState + " - " + stateCapitals.get(currentState).getName() + 
                    " | Pop: " + stateCapitals.get(currentState).getPopulation() + " | Area: " + 
                    stateCapitals.get(currentState).getSquareMileage() + " sq mi");
            }
        }
        
    }
}
