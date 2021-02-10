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
public class Airplane1 {
    private double longitude;
    private double latitude;
    private int flightNumber;
    private int milTime;
    private String airline;

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getMilTime() {
        return milTime;
    }

    public void setMilTime(int milTime) {
        this.milTime = milTime;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }
    
    public Airplane1(double longitude, double latitude, int flightNumber,
            int milTime, String airline) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.flightNumber = flightNumber;
        this.milTime = milTime;
        this.airline = airline;
    }
           
}
