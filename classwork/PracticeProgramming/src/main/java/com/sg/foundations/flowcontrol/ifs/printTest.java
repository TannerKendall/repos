
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

public class printTest {
    public static void main(String[] args) {
        
        Scanner inputReader = new Scanner(System.in);
       
        
        System.out.print("Please enter a number: ");
        int number = inputReader.nextInt();
        System.out.flush();
       
        
        System.out.println(number);
        
    }
    
}
