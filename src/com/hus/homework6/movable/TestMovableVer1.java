package com.hus.homework6.movable;

public class TestMovableVer1 {
    public static void main(String[] args) {
        Movable movable = new MovablePoint(2, 3, 2, 4);
        System.out.println(movable);
        movable.moveDown();
        System.out.println(movable);
    }
}
