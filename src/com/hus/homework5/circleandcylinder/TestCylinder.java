package com.hus.homework5.circleandcylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder:"
                + " radius = " + cylinder1.getRadius()
                + " height = " + cylinder1.getHeight()
                + " surface area = " + cylinder1.getArea()
                + " volume = " + cylinder1.getVolume());
        System.out.println();

        Cylinder cylinder2 = new Cylinder(10.0);
        System.out.println("Cylinder:"
                + " radius = " + cylinder2.getRadius()
                + " height = " + cylinder2.getHeight()
                + " surface area = " + cylinder2.getArea()
                + " volume = " + cylinder2.getVolume());
        System.out.println();

        Cylinder cylinder3 = new Cylinder(2.0, 10.0);
        System.out.println("Cylinder:"
                + " radius = " + cylinder3.getRadius()
                + " height = " + cylinder3.getHeight()
                + " surface area = " + cylinder3.getArea()
                + " volume = " + cylinder3.getVolume());
    }
}
