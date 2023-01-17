package com.hus.homework6.geometric;

public class TestGeometric {
    public static void main(String[] args) {
        GeometricObject geometric = new Circle(3.0);
        System.out.println(geometric);
        System.out.println(geometric.getArea());
        System.out.println(geometric.getPerimeter());
        System.out.println();

        GeometricObject geometric1 = new Rectangle(1.0, 2.0);
        System.out.println(geometric1);
        System.out.println(geometric1.getArea());
        System.out.println(geometric1.getPerimeter());

        GeometricObject[] list = new GeometricObject[10];
        for (int i = 0; i < 5; i++) {
            list[i] = new Circle(i);
            list[i + 5] = new Rectangle(i, i * 2);
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(list[i].getArea());
        }
        for (int i = 0; i < 10; i++) {
            if (list[i] instanceof Circle) {
                System.out.println(((Circle) list[i]).getRadius());
            }
        }
    }
}

