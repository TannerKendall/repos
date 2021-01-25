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
public class FruitSalad {
    public static void main(String[] args) {
        
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry",
            "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry",
            "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange",
            "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple",
            "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};
        
        String[] fruitSalad = new String[12];
        int i = 0;
        int numOfApples = 0;
        int numOfOranges = 0;
        
        for (String currentFruit : fruit) {
            
            if (currentFruit.equals("Kiwi Fruit")){
                fruitSalad[i] = currentFruit;
                i++;
            }
            
            if (currentFruit.contains("berry")) {
                fruitSalad[i] = currentFruit;
                i++;
            } else if (numOfApples < 3 && currentFruit.contains("Apple")) {
                fruitSalad[i] = currentFruit;
                i++;
                numOfApples++;
            }else if (numOfApples < 3 && currentFruit.contains("apple")) {
                fruitSalad[i] = currentFruit;
                i++;
                numOfApples++;
            }else if (numOfOranges < 2 && currentFruit.contains("Orange")) {
                fruitSalad[i] = currentFruit;
                i++;
                numOfOranges++;
            } 
            
        } 
        System.out.println("The salad contains: ");
        for (String fruity : fruitSalad) {
           System.out.print(fruity + ", ");
        } 
        
    }
  
}



/**
        int i = 0;
        int numOfApples = 0;
        int numOfOranges = 0;
        
        for (String currentFruit : fruit) {
            if (currentFruit.contains("berry")) {
                fruitSalad[i] = currentFruit;
                i++;
            } else if (currentFruit.equalsIgnoreCase("kiwi fruit")) {
                fruitSalad[i] = currentFruit;
                i++;
            }
            
            if (numOfApples < 3) {
                if (currentFruit.equalsIgnoreCase("gala apple") || currentFruit.equalsIgnoreCase("granny smith apple") ||
                        currentFruit.equalsIgnoreCase("braeburn apple") ||currentFruit.equalsIgnoreCase("pink pearl apple") ||
                        currentFruit.equalsIgnoreCase("fuji apple") ||currentFruit.equalsIgnoreCase("kiku apple")) {
                    fruitSalad[i] = currentFruit;
                    i++;
                    numOfApples++;
                }
            } else if (numOfOranges < 2) {
                if (currentFruit.equalsIgnoreCase("navel orange") || currentFruit.equalsIgnoreCase("blood orange") ||
                        currentFruit.equalsIgnoreCase("florida orange") ||currentFruit.equalsIgnoreCase("satsume orange")) {
                    fruitSalad[i] = currentFruit;
                    i++;
                    numOfOranges++;
                }
            }
        }
        for (i = 0; i < fruitSalad.length; i ++) {
            System.out.println(fruitSalad[i]);
        }
        System.out.println(numOfApples);
        System.out.println(numOfOranges);
        */