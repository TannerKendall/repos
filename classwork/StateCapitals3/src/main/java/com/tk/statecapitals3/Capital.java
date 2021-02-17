/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.statecapitals3;

/**
 *
 * @author Tanner Kendall
 */
public class Capital {
    
    private String name;
    private int population;
    private double squareMileage;

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }
    
    public void setPopulation(int population){
        this.population = population;
    }

    public double getSquareMileage() {
        return squareMileage;
    }
    
    public void setSquareMileage(double squareMileage){
        this.squareMileage = squareMileage;
    }

    public Capital(String name, int population, double squareMileage) {
        this.name = name;
        this.population = population;
        this.squareMileage = squareMileage;
    }
    
}
