package com.cistech.javafs.training.week2;

import com.cistech.javafs.training.week1.Kid;
import com.cistech.javafs.training.week1.Person;

import java.util.Arrays;

public class JavaCorePackages {

    public static void main(String[] args) {

        Person[] persons = new Person[3];
        persons[0] = new Kid(12);
        persons[1] = new Kid(24);
        persons[2] = new Kid(36);

        // ==
        Person kid24 = new Kid(24);

        System.out.println(persons[1].equals(kid24));

        Arrays.sort(persons);

        // ==
        // .equals



    }
}
