package com.cistech.javafs.training.week1;

public class Dog extends Animal{



    int legs;

    int age;

    Person p;

    String s;


    // int - 0
    // boolean - false
    // float - of;
    // long - 0;
    // char - u0000;
    // All object types - null

    public Dog(int legs, int age){
        super();
        this.legs = legs;
        this.age = age;
    }

    public Dog(int age){
        super(age);
        this.age = age;
        this.legs = 4;

    }

    public Dog(){
        //
    }

    @Override
    public void makeSound(){
        System.out.println("from Dog class");
    }
}
