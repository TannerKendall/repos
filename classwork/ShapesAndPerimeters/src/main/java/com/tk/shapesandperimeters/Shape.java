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
abstract class Shape {
    public String color;
    public double area;
    public double perimeter;
    abstract double getArea();
    abstract double getPerimeter();

}
