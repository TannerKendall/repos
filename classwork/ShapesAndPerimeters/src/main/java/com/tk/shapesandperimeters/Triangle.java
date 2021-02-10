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
public class Triangle extends Shape {
    
    float a, b, c;
    float width, height;
    
    @Override
    double getArea() {
        area = ((width * height) / 2);
        return area;
    }

    @Override
    double getPerimeter() {
        perimeter = a + b + c;
        return perimeter;
    }
    
}
