/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author Tanner Kendall
 */
public class FruitsBasket {
    public static void main(String[] args) {
        
        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
            "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
            "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
            "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
            "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
            "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
            "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
            "Dragonfruit", "Apple", "Orange", "Orange"};
        
        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;
        
        //fruit counting
        for (String currentFruit : fruitBasket) {
            
            if (currentFruit.equalsIgnoreCase("apple")){
                numApples++;
            } else if (currentFruit.equalsIgnoreCase("orange")) {
                numOranges++;
            } else {
                numOtherFruit++;
            }
        }
        
        //print results
        System.out.println("Total # of Fruit in Basket: " + fruitBasket.length);
        System.out.println("Number of Apples: " + numApples);
        System.out.println("Number of Oranges: " + numOranges);
        System.out.println("Number of other fruits: " + numOtherFruit);
        
    }
}
