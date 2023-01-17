package com.hus.homework6.geometric;

public class Circle implements GeometricObject {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle[radius = " + radius + "]";
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return  2 * radius * Math.PI;
    }

}
