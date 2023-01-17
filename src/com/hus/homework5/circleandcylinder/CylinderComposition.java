package com.hus.homework5.circleandcylinder;

public class CylinderComposition {
    private Circle base;
    private double height;

    public CylinderComposition() {
        base = new Circle();
        height = 1.0;
    }

    public CylinderComposition(double height) {
        base = new Circle();
        this.height = height;
    }

    public CylinderComposition(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    public CylinderComposition(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    public Circle getBase() {
        return base;
    }

    public void setBase(Circle base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return base.getArea() * height;
    }

    public double getArea() {
        return 2 * Math.PI * base.getRadius() * height + 2 * base.getArea();
    }

    @Override
    public String toString() {
        return "Cylinder: composed of " + base.toString() + " height = " + height;
    }
}

