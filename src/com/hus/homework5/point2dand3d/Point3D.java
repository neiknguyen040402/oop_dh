package com.hus.homework5.point2dand3d;

public class Point3D extends Point2D {
    private float z;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
        z = 0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x, y);
        this.z = z;
    }

    public float[] getXYZ() {
        float[] array = new float[3];
        array[0] = getX();
        array[1] = getX();
        array[2] = z;
        return array;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + getZ() + ")";
    }
}
