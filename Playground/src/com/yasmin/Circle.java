package com.yasmin;

public class Circle {
    private double radius;
    private String color;

    public Circle() {
        this.radius=1.0;
        this.color="red";
    }

    public Circle(double r) {
        this.radius=r;
        this.color="red";
    }

    public Circle(double r, String c){
        this.radius=r;
        this.color=c;
    }

    public String getColor() {
        return this.color;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getCircumference(){
        return Math.PI*radius*2;
    }

    public void setRadius(double newRadius){
        this.radius=newRadius;
    }

    public void setColor(String newColor){
        this.color=newColor;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
