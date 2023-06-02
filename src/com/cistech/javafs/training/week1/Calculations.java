package com.cistech.javafs.training.week1;

public class Calculations {

    public int sum(int a , int b){
        return a+b;
    }

    public int sum(int a , int b, int c){
        sum(a,b);
        // do something else
        return 0;
    }

    public String sum(int a, int b , int c, int d){
        return "";
    }
}
