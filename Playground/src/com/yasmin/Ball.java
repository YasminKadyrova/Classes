package com.yasmin;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x1,float y1, int ballRadius, int speed, int direction) {
        this.x=x1;
        this.y=y1;
        this.radius=ballRadius;
        this.xDelta=speed;
        this.yDelta=direction;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public float getxDelta() {
        return xDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void move(){
        x+=xDelta;
        y+=yDelta;
    }

    public void reflectHorizontal(){
        xDelta=xDelta*(-1);
    }

    public void reflectVertical(){
        yDelta=yDelta*(-1);
    }

    @Override
    public String toString() {
        return "Ball[" +
                "(" + x +
                "," + y +
                ")" +
                "speed=(" + xDelta +
                "," + yDelta +
                ']';
    }
}
