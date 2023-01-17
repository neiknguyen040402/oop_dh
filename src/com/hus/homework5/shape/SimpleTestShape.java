package com.hus.homework5.shape;

public class SimpleTestShape {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        System.out.println();

        Circle circle = new Circle();
        System.out.println(circle);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());
        System.out.println();

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println();

        Square square = new Square();
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
    }
}
