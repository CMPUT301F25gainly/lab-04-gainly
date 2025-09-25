package com.example.lab_04_gainly;

public class Pentagon extends Shape{
    private int sideLength;

    public Pentagon(int sideLength){
        this.sideLength = sideLength;
    }

    public int circumfrance(){
        return sideLength * 5;
    }
}
