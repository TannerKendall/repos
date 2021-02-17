/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.simplefileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 */
public class SimpleFileIO {

    public static void main(String[] args) throws Exception {
        
        PrintWriter out = new PrintWriter(new FileWriter("OutFile.txt"));
        
        out.println("This is a line in my file...");
        out.println("This is a second line in my file...");
        out.println("This is a third line in my file...");
        out.flush();
        out.close();
        
        Scanner inputReader = new Scanner(new BufferedReader(new FileReader("OutFile.txt")));
        
        while(inputReader.hasNextLine()){
            String currentLine = inputReader.nextLine();
            System.out.println(currentLine);
        }
        
        System.out.println("That's all the contents in the file");
        
    }
    
}
