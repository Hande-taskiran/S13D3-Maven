package org.example;

public class Wall {
    double width;
    double height;

    public Wall(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double num){
        if (num<0) {
            width = 0;
        } else {
            width = num;
        }
    }

    public void setHeight(double num){
        if (num<0) {
            height = 0;
        } else {
            height = num;
        }
    }

    public double getArea(){
        return width*height;
    }

}
