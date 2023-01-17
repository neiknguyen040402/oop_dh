package com.hus.homework6.movable_ver2;

public class TestMovableVer2 {
    public static void main(String[] args) {
        Movable movable = new MovablePoint(1, 2, 3, 4);
        System.out.println(movable);
        movable.moveLeft();
        System.out.println(movable);

        Movable movable1 = new MovableCircle(1, 4, 2,5, 3);
        System.out.println(movable1);
        movable1.moveDown();
        System.out.println(movable1);
    }
}
