package com.hus.homework5.circleandcylinder;

public class TestCylinderComposed {
    public static void main(String[] args) {
        CylinderComposition cylinderCom = new CylinderComposition();
        System.out.println(cylinderCom);
        System.out.println("Cylinder:"
                + " radius = " + cylinderCom.getBase().getRadius()
                + " height = " + cylinderCom.getHeight()
                + " surface area = " + cylinderCom.getArea()
                + " volume = " + cylinderCom.getVolume());

    }
}
