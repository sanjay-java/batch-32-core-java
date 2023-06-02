package com.cistech.javafs.training.week1;

abstract public class Person {
    private int age;
    private float weight;
    private float height;



    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
// getters and setters

    //getter for age
    public int getAge(){
        return age;
    }

    // setter for age
    public void setAge(int age){
        this.age = age;
    }



    double calculateBMI(){
        return weight/(height*height);
    }

    abstract void dance();


    void walk(){
        System.out.println("Person is walking");
    }

}
