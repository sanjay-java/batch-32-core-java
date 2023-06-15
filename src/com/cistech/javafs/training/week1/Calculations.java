package com.cistech.javafs.training.week1;

final public class Calculations {
    private final int a ;
    private final int b ;

    Person p;


    public Calculations(){
        this(0,0);
    }
    public Calculations(int a , int b ){
        this. a  = a;
        this.b = b;
    }


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
