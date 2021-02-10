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
public class Rectangle extends Shape {
    
    private double length, width;
    
    @Override
    double getArea() {
        area = length * width;
        return area;
    }

    @Override
    double getPerimeter() {
        perimeter = 2 * (length + width);
        return perimeter;
    }
    
}
