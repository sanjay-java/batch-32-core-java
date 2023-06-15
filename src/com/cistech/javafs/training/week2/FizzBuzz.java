package com.cistech.javafs.training.week2;

import java.util.Arrays;

public class FizzBuzz {

    int[] a = new int[]{-7348,2,23,4,9,6,9};
    int i2=a[0];
    int i1=a[0];
    public void test() {
        for (int i=0;i<a.length;i++) {
            if (a[i]<i2) {
                i2=a[i];
            }
            else if(a[i]>i1){
                i1=a[i];
            }
        }
        System.out.println("Largest Number is"+ i1);
        System.out.println("Smallest Number is"+ i2);
        Arrays.sort(a);
    }
    public static void main(String[] args) {
        FizzBuzz ls=new FizzBuzz();
        ls.test();

    }

}

// core libraries
// java.lang
    //Object class
    // object
    // String
    // Exception
// java.util
    // Collections
    // Thread

// java.io
// java.sql
// java.net
// java.math


