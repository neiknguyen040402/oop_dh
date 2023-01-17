package com.hus.homework5.point2dand3d;

public class Test2DAnd3D {
    public static void main(String[] args) {
        Point3D point3D = new Point3D(1, 2, 3);
        System.out.println(point3D);

        Point2D point2D = new Point2D(1, 2);
        System.out.println(point2D);
        point2D.setXY(0, 0);
        System.out.println(point2D);
    }
}
