/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.classmodeling;

/**
 *
 * @author Tanner Kendall
 */
public class IceCream1 {
    private String flavor1;
    private String flavor2;
    private String flavor3;
    private String color;

    public String getFlavor1() {
        return flavor1;
    }

    public void setFlavor1(String flavor1) {
        this.flavor1 = flavor1;
    }

    public String getFlavor2() {
        return flavor2;
    }

    public void setFlavor2(String flavor2) {
        this.flavor2 = flavor2;
    }

    public String getFlavor3() {
        return flavor3;
    }

    public void setFlavor3(String flavor3) {
        this.flavor3 = flavor3;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public IceCream1(String flavor1, String flavor2, String flavor3, String color) {
        this.flavor1 = flavor1;
        this.flavor2 = flavor2;
        this.flavor3 = flavor3;
        this.color = color;
    }
    
    
    
}
