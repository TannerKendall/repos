/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tk.shapesandperimeters;

/**
 *
 * @author Tanner Kendall
 */
public class Square extends Shape {
    
    private double sideLength;
    
    @Override
    double getArea() {
        area =  sideLength * sideLength;
        return area;
    }

    @Override
    double getPerimeter() {
        perimeter = sideLength * 4;
        return perimeter;
    }
    
}
