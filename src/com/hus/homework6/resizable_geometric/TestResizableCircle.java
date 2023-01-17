package com.hus.homework6.resizable_geometric;

public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle resizableCir = new ResizableCircle(10);
        System.out.println("circle with radius " + resizableCir.radius);
        System.out.println("area: " + resizableCir.getArea());
        System.out.println("perimeter: " + resizableCir.getPerimeter());
        resizableCir.resize(50);
        System.out.println("resize to 50%");
        System.out.println("circle with radius " + resizableCir.radius);
        System.out.println("area: " + resizableCir.getArea());
        System.out.println("perimeter: " + resizableCir.getPerimeter());

        GeometricObject geoObj = new Circle(6.0);
        System.out.println(geoObj.getArea());
    }
}

