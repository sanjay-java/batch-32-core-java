package com.cistech.javafs.training.week1;

import java.util.Comparator;

public class Kid extends Male implements Comparator<Kid> {

    float height;
    String name;

    @Override
    public float getHeight() {
        return height;
    }

    @Override
    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    int rollNumber;

    public Kid(int age){
        this.age = age;
    }

    public Kid(){

    }

void dance(){
    System.out.println("I can dance");
}

    // name and height
    @Override
    public int compare(Kid o1, Kid o2) {
        if(o1.getName().compareTo(o2.getName()) > 1)
        {
            return 1;
        }
        else if(o1.getName().compareTo(o2.getName()) < 1){
            return -1;
        }
        else if(o1.getHeight() > o2.getHeight()) return 1;
        // else if(this.age < o.age ) return -1;
        return 0;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Kid)) return false;
        return ((Kid)obj).age == this.age;

    }

    public int compareTo(Kid o) {
       // age
        // positive integer - greater than
        // negative int - less than
        // zero - equals
        if(this.age > o.age) return 1;
        else if(this.age < o.age ) return -1;
        return 0;
        // return this.age - o.age;
    }


}
