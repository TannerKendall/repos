/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.windowmaster;

import java.util.Scanner;

/**
 *
 * @author Tanner Kendall
 * Date: 1/12/21
 */
public class WindowMaster {
    public static void main(String[] args) {
        
        //declare variables for height and width
        float height = 0;
        float width = 0;
        int numberOfWindows = 0;
        
        //string variables to hold user input
        String stringHeight = null;
        String stringWidth = null;
        String stringArea;
        String stringPerimeter;
        String stringNumberOfWindows = null;
        
        //other variables
        float areaOfWindow = 0;
        float cost = 0;
        float perimeterOfWindow = 0;
        
        //scanner
        Scanner myScanner = new Scanner(System.in);
        
        while( height <= 0){ 
           System.out.println("Please enter the window height:");
           stringHeight = myScanner.nextLine();
            try{
            height = Float.parseFloat(stringHeight);
            } catch(NumberFormatException ex) {
                height = 0;
                System.out.println("Please enter a valid number");
            }
        }
        
        while( width <= 0){ 
           System.out.println("Please enter the window width:");
           stringWidth = myScanner.nextLine();
            try{
            width = Float.parseFloat(stringWidth);
            } catch(NumberFormatException ex) {
                width = 0;
                System.out.println("Please enter a valid number");
            }
        }
        
        while( numberOfWindows <= 0){ 
           System.out.println("Please enter the number of windows:");
           stringNumberOfWindows = myScanner.nextLine();
            try{
            numberOfWindows = Integer.parseInt(stringNumberOfWindows);
            } catch(NumberFormatException ex) {
                numberOfWindows = 0;
                System.out.println("Please enter a valid number");
            }
        }
        
        
        
        /*ask for area and perimeter
        System.out.println("Please enter the area of the windows:");
        stringArea = myScanner.nextLine();
        System.out.println("Please enter the perimeter of the windows");
        stringPerimeter = myScanner.nextLine();
        */
        
        
        
        
        /*when asking for area and perimeter
        areaOfWindow = Float.parseFloat(stringArea);
        perimeterOfWindow = Float.parseFloat(stringPerimeter);
        */
        
        
        //area of window
        areaOfWindow = height * width;
      
        
        //perimeter of window
        perimeterOfWindow = 2 * (height + width);

        //total cost
        cost = (((3.50f * areaOfWindow) + (2.25f * perimeterOfWindow)) * numberOfWindows);
        
        //output
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Number of Windows: " + stringNumberOfWindows);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
        
        
        
    }
}
