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
public class Circle extends Shape {
    
    double radius, diameter;
    double pi = 3.1415926;
    
    @Override
    double getArea() {
        area = pi * (radius * radius);
        return area;
    }

    @Override
    double getPerimeter() {
        perimeter = 2 * pi * radius;
        return perimeter;
    }
    
    
}
