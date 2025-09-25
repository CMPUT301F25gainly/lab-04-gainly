package com.example.lab_04_gainly;
public class Circle extends Shape {
    private int radius;

    // Constructor
    public Circle(int x, int y, int radius) {
        super(x, y);  // Call Shape's constructor
        this.radius = radius;
    }

    // Getter for radius
    public int getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Simple toString without accessing x,y
    @Override
    public String toString() {
        return "Circle with radius " + radius;
    }
}