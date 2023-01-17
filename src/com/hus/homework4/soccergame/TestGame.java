package com.hus.homework4.soccergame;

public class TestGame {
    public static void main(String[] args) {
        Ball ball = new Ball(5.0f, 5.0f, 5.0f);
        System.out.println(ball);
        Player player = new Player(3, 5.0f, 10.0f);
        System.out.println(player);
        player.move(5.0f, 5.0f);
        player.jump(10.0f);
        System.out.println(player);
    }
}
