package com.company;

public class Rectangle {
    int length;
    int breadth;

    public void setDimension(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return (this.length * this.breadth);
    }
}
