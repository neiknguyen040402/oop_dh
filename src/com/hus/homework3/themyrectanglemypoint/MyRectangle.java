package com.hus.homework3.themyrectanglemypoint;

public class MyRectangle {
    private MyPoint TopLeftPoint;
    private MyPoint BottomRightPoint;

    public MyRectangle(MyPoint topLeftPoint, MyPoint bottomRightPoint) {
        TopLeftPoint = topLeftPoint;
        BottomRightPoint = bottomRightPoint;
    }

    public MyRectangle(int startX, int startY, int endX, int endY) {
        this.TopLeftPoint = new MyPoint(startX, startY);
        this.BottomRightPoint = new MyPoint(endX, endY);
    }

    public MyPoint getTopLeftPoint() {
        return TopLeftPoint;
    }

    public void setTopLeftPoint(MyPoint topLeftPoint) {
        TopLeftPoint = topLeftPoint;
    }

    public MyPoint getBottomRightPoint() {
        return BottomRightPoint;
    }

    public void setBottomRightPoint(MyPoint bottomRightPoint) {
        BottomRightPoint = bottomRightPoint;
    }

    public MyPoint getBottomLeftPoint() {
        return new MyPoint(TopLeftPoint.getX(), BottomRightPoint.getY());
    }

    public double getPerimeter() {
        return (TopLeftPoint.distance(getBottomLeftPoint()) + getBottomLeftPoint().distance(BottomRightPoint)) * 2;
    }

    public double getArea() {
        return TopLeftPoint.distance(getBottomLeftPoint()) * getBottomLeftPoint().distance(BottomRightPoint);
    }

    @Override
    public String toString() {
        return "Rectangle: topLeftPoint " + TopLeftPoint + ", bottomRightPoint " + BottomRightPoint;
    }
}
