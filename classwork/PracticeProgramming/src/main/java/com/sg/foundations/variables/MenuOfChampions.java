/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.variables;

/**
 *
 * @author Tanner Kendall
 */
public class MenuOfChampions {
    public static void main(String[] args) {
        
        String pizza, pie, omelet;
        double pizzaPrice, piePrice, omeletPrice;
        
        pizza = "Slice of Big Rico Pizza";
        pie = "Invisible Strawberry Pie";
        omelet = "Denver Omelet";
        pizzaPrice = 500.00;
        piePrice = 2.00;
        omeletPrice = 1.50;
        
        System.out.println("  __    __   __   __   __   __   __   __    __\n" +
        " _\\/_  _\\/_ _\\/_ _\\/_ _\\/_ _\\/_ _\\/_ _\\/_  _\\/_\n" +
        " \\/\\/  \\/\\/ \\/\\/ \\/\\/ \\/\\/ \\/\\/ \\/\\/ \\/\\/  \\/\\/\n");
        
        System.out.println("        WELCOME TO RESTAURANT NIGHT VALE!");
        System.out.println("        Todays Menu Is..");
        
        System.out.println("  __    __   __   __   __   __   __   __    __\n" +
        " _\\/_  _\\/_ _\\/_ _\\/_ _\\/_ _\\/_ _\\/_ _\\/_  _\\/_\n" +
        " \\/\\/  \\/\\/ \\/\\/ \\/\\/ \\/\\/ \\/\\/ \\/\\/ \\/\\/  \\/\\/\n");
        
        System.out.println("        $ " + pizzaPrice + " *** " + pizza);
        System.out.println("        $ " + piePrice + " *** " + pie);
        System.out.println("        $ " + omeletPrice + " *** " + omelet);
    }
}
