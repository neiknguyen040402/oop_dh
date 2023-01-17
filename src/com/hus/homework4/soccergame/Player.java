package com.hus.homework4.soccergame;

public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }

    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }

    public void jump(float zDisp) {
        z += zDisp;
    }


    public boolean near(Ball ball) {
        float xDiff = this.x - ball.getX();
        float yDiff = this.y - ball.getY();
        float distance = (float) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
        return distance < 8;
    }

    public void kick(Ball ball) {
        ball.setXYZ(x + 20f, y + 20f, 10f);
    }

    public String toString() {
        return "Player position is: (" + x + "," + y + ", jump=" + z + ")";
    }
}
