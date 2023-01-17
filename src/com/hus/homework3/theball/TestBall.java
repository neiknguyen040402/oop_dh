package com.hus.homework3.theball;

public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball(80.0f, 35.0f, 5, 4.0f, 6.0f);
        System.out.println(ball);

        float xMin = 0.0f;
        float xMax = 100.0f;
        float yMin = 0.0f;
        float yMax = 50.0f;

        for (int i = 0; i < 15; i++) {
            ball.move();
            System.out.println(ball);
            float xNew = ball.getX();
            float yNew = ball.getY();
            int radius = ball.getRadius();

            if((xNew + radius) > xMax || (xNew - radius) < xMin) {
                ball.reflectHorizontal();
            }
            if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
                ball.reflectVertical();
            }
        }
    }
}
