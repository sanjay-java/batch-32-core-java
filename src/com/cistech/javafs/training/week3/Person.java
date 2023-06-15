package com.cistech.javafs.training.week3;

public class Person {

    private String some;
    private String name;
    private int height; // inches
    private int age;
    private float weight;

    public Person(){
        this("",0,0,0);
    }

    public Person(String name, int height, int age, float weight) {
        this.name = name;
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double calculateBMI() throws Exception{
        if(height == 0) throw new IllegalArgumentException("height can not be zero");
        return weight/(height * height);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
