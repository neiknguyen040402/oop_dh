package com.hus.homework4.bouncingballs;

public class TestBouncingBall {
    public static void main(String[] args) {
        Ball ball = new Ball(7, 11, 5, 10, 45);

        for (int i = 1; i <= 5; i++) {
            System.out.println(ball);
            ball.move();
        }
        System.out.println("reflect horizontal");
        ball.reflectHorizontal();
        for (int i = 1; i <= 5; i++) {
            System.out.println(ball);
            ball.move();
        }
        System.out.println("reflect vertical");
        ball.reflectVertical();
        for (int i = 1; i <= 5; i++) {
            System.out.println(ball);
            ball.move();
        }
    }
}
