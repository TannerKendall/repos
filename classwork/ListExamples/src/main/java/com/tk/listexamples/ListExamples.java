/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.listexamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Tanner Kendall
 */
public class ListExamples {
    public static void main(String[] args) {
        
        List<String> stringList = new ArrayList<>();
        
        
        stringList.add("The first string.");
        
        
        stringList.add("The second string");
        
        stringList.add("The third string");
        
        stringList.add("The fourth string");
        
        System.out.println("List Size " + stringList.size());
        
        for(String currentString: stringList){
            System.out.println(currentString);
        }
        
        Iterator<String> iterator = stringList.iterator();
        
        while (iterator.hasNext()) {
            String currentString = iterator.next();
            System.out.println(currentString);
        }
        
        
    }
}
