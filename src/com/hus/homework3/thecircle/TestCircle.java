package com.hus.homework3.thecircle;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("The circle has radius of "
                + circle1.getRadius() + " and area of " + circle1.getArea());

        Circle circle2 = new Circle(2.0);
        System.out.println("The circle has radius of "
                + circle2.getRadius() + " and area of " + circle2.getArea());

        Circle circle3 = new Circle(2.0, "blue");
        System.out.println("The circle has radius of "
                + circle3.getRadius() + " and area of " + circle3.getArea()
                + " and color of " + circle3.getColor());

        Circle circle4 = new Circle();
        circle4.setRadius(5.5);
        System.out.println("radius is: " + circle4.getRadius());

        circle4.setColor("green");
        System.out.println("color is: " + circle4.getColor());

        //System.out.println(circle4.setRadius(4.4));

        Circle circle5 = new Circle(5.5);
        System.out.println(circle5);

        Circle circle6 = new Circle(6.6);
        System.out.println(circle6.toString());
        System.out.println(circle6);
        System.out.println("Operator '+' invokes toString() too: " + circle6);

        // Test constructors and toString()
        Circle circle7 = new Circle(1.1);
        System.out.println(circle7);

        //Test setter and getter
        circle7.setRadius(2.2);
        System.out.println(circle7);
        System.out.println("radius is: " + circle7.getRadius());

        //Test getArea and getCircumference
        System.out.printf("area is: %.2f%n", circle7.getArea());
        System.out.printf("Circumference is: %.2f%n", circle7.getCircumference());
    }
}
