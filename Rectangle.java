package org.gitProject;

public class Rectangle {

//data
    double x; double y; double height; double width;

//default constructor
    Rectangle() {}

//setters
    //set-x
    public void setX(double x) {
        this.x=x;
    }
    //set-y
    public void setY(double y) {
        this.y=y;
    }
    //set-height
    public void setHeight(double height) {
        this.height=height;
    }
    //set-width
    public void setWidth(double width) {
        this.width=width;
    }

//getters
    //get-x
    public void getX() {
        System.out.println();
    }
    //get-y
    public void getY() {
        System.out.println();
    }
    //get-height
    public void getHeight(double height) {
        this.height=height;
    }
    //get-width
    public void getWidth(double width) {
        this.width=width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", height=" + height +
                ", width=" + width +
                '}';
    }
}
