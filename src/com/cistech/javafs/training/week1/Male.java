package com.cistech.javafs.training.week1;

abstract public class Male extends Person{



    @Override
    void walk(){
       super.walk();
       System.out.println("walk differently for Male");
    }

}

// diamond problem
