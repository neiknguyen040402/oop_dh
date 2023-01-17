package com.hus.homework6.shape_abstract;

public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Circle(5.5, "red", false);
        System.out.println(shape1);
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());
        System.out.println(shape1.getColor());
        System.out.println(shape1.isFilled());
        //System.out.println(shape1.getRadius());
        System.out.println();

        Circle circle1 = (Circle) shape1;
        System.out.println(circle1);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
        System.out.println(circle1.getColor());
        System.out.println(circle1.isFilled());
        System.out.println(circle1.getRadius());

        Shape shape2 = new Rectangle(1.0, 2.0, "red", false);
        System.out.println(shape2);
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());
        System.out.println(shape2.getColor());
        //System.out.println(shape2.getLength());
        System.out.println();

        Rectangle rectangle = (Rectangle) shape2;
        System.out.println(rectangle);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(rectangle.getColor());
        System.out.println(rectangle.getLength());
        System.out.println();

        Shape shape3 = new Square(6.6);
        System.out.println(shape3);
        System.out.println(shape3.getArea());
        System.out.println(shape3.getColor());
        //System.out.println(shape3.getSide());
        System.out.println();

        Rectangle rectangle1 = (Rectangle) shape3;
        System.out.println(rectangle1);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getColor());
        //System.out.println(rectangle1.getSide());
        System.out.println(rectangle.getLength());

        Square square = (Square) rectangle1;
        System.out.println(square);
        System.out.println(square.getArea());
        System.out.println(shape1.getColor());
        System.out.println(square.getSide());
        System.out.println(square.getLength());
    }
}
