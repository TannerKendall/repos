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
public class Airplane2 {
    private String planeType;
    private String color;
    private int map;
    private double topSpeed;
    private double timeToLift;

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMap() {
        return map;
    }

    public void setMap(int map) {
        this.map = map;
    }

    public double getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getTimeToLift() {
        return timeToLift;
    }

    public void setTimeToLift(double timeToLift) {
        this.timeToLift = timeToLift;
    }

    public Airplane2(String planeType, String color, int map, double topSpeed, double timeToLift) {
        this.planeType = planeType;
        this.color = color;
        this.map = map;
        this.topSpeed = topSpeed;
        this.timeToLift = timeToLift;
    }
    
    
}
