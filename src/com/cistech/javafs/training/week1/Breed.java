package com.cistech.javafs.training.week1;

public interface Breed {
    // marker interface
    // Serializable
    final int age = 10;

     void printBreedName();

     void printBreedInUpperCase();

     // default

     default void printBreed(){

     }
}
// access modifiers
// public, private, protected, default

// packages
// classes

// within the class
// class within the package
// class from other package


// private -> only methods and variables -> only within class

// default ->
// within same package -> class, method, variable

// protected
// within same package and only subclasses in other package


// public variable ->
