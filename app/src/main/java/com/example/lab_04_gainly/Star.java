package com.example.lab_04_gainly;

public class Star extends Shape{
    private int points;
    private double outerRadius;
    private double innerRadius;

    public Star() {
        super();
        this.points = 5;
        this.outerRadius = 10.0;
        this.innerRadius = 5.0;
    }
    public Star(int x, int y, int points, double outerRadius, double innerRadius) {
        super(x, y);
        setPoints(points);
        setRadii(outerRadius, innerRadius);
    }
    public int getPoints() {
        return points;
    }
    public void setPoints(int points) {
        if (points < 3) {
            throw new IllegalArgumentException("Star must have at least 3 points");
        }
        this.points = points;
    }
    public double getOuterRadius() {
        return outerRadius;
    }
    public double getInnerRadius() {
        return innerRadius;
    }
    public void setRadii(double outerRadius, double innerRadius) {
        if (outerRadius < 0 || innerRadius < 0) {
            throw new IllegalArgumentException("Radii cannot be negative");
        }
        if (outerRadius <= innerRadius) {
            throw new IllegalArgumentException("Outer radius must be greater than inner radius");
        }
        this.outerRadius = outerRadius;
        this.innerRadius = innerRadius;
    }
}
