package com.yasmin;
public class Rectangle {
    private float length;
    private float width;

    public Rectangle(){
        this.length=1.0f;
        this.width=1.0f;
    }

    public Rectangle(float l, float w){
        this.length=l;
        this.width=w;
    }

    public float getLength(){
        return this.length;
    }

    public void setLength(float newLength){
        this.length=newLength;
    }

    public float getWidth(){
        return this.width;
    }

    public void setWidth(float newWidth){
        this.width=newWidth;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return (width+length)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
