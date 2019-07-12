package com.company;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder() {
    }

    public Cylinder(double radius, double color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double TheTich(){
        return Math.PI*super.getRadius()*super.getRadius()*height;
    }


}
