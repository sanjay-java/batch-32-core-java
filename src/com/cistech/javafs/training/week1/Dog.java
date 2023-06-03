package com.cistech.javafs.training.week1;

 public class Dog extends Animal implements Breed, Gender{

    private final static int tail;

    static {
        tail = 1;
    }

    private int legs;

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

    @Override
    public void printBreedName() {
        System.out.println("some breed");
    }

    @Override
    public void printBreedInUpperCase() {
        Breed.super.printBreed();
        Gender.super.printBreed();
        System.out.println("SOME BREED");
    }

    @Override
    public void printBreed() {
        Breed.super.printBreed();
    }

    final protected void printDogName(){
        int x = 7;
        int y = 10;
        // print
    }

    public static void printDogOwnerName(){
        System.out.println("owner");
    }
}
