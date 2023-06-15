package com.cistech.javafs.training.week1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Person p = new Person();

        //Male m = new Male();

        //m.walk();

        //m.calculateBMI();

        Kid kid = new Kid();
        kid.calculateBMI();

        Calculations c = new Calculations();
        c.sum(2,3);
        String s = c.sum(2,3,4,5);


        Animal a = new Animal(4);
        a.hashCode();

        Dog d = new Dog();
        Animal a2 = new Dog();


        //callMe(a2);
        //callMe(a);
        callMe(d);


        Dog dog = new Dog();
        System.out.println(dog.age);
        dog.printBreed();


        Dog dog1 = new Dog(23);
        System.out.println(dog1.age);

        Dog dog2 = new Dog(3,23);
        System.out.println(dog2.age);

        callMe(d);

        Dog.printDogOwnerName();

        Dog.printDogOwnerName();

    }

    /*static void callMe(Animal m){
        m.makeSound();
    }*/

    static void callMe(Breed b){

    }
}

// Object

// naming conventions for JAVA
//