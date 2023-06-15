package com.cistech.javafs.training.week2;

import com.cistech.javafs.training.week1.Kid;
import com.cistech.javafs.training.week1.SortKidByAgeNameAndHeight;

import java.util.Arrays;
import java.util.Comparator;

public class Strings {

    public static void main(String[] args) {
        String s = "batch32"; // string literal
        String s1 = new String("batch32"); // object using new
        String s2 = new String("javaclass"); // object using new
        String s3 = new String("javaclass"); // object using new
        String s5 = "batch32";

        System.out.println(s == s5);
        System.out.println(s == s1);
        System.out.println(s.equals(s1));

        Arrays.sort(new Kid[]{},new SortKidByAgeNameAndHeight());
        Arrays.sort(new Kid[]{},new SortKidByAgeNameAndHeight());
        Arrays.sort(new Kid[]{},new SortKidByAgeNameAndHeight());
        // ananymous inner class
        Arrays.sort(new Kid[]{}, new Comparator<Kid>() {
            @Override
            public int compare(Kid o1, Kid o2) {
                return 0;
            }
        });


        // .equals
        //  uppercase
        // lower
        // substring
        // replace
        //
        String.valueOf(new char[]{1,2,3},2,23);
        Integer.valueOf("");

        s.toUpperCase();



        reversingEachWord("Reverse me");

         s1 = "some test";
         s2 = "in Java";
         for(int i =0;i<10;i++){
             s3 = s1+String.valueOf(i);
         }
         s3 = "some test123456789";
         // StringBuilder -
        // StringBuffer - ThreadSafe
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        for(int i =0;i<10;i++){
            sb.append(i);
        }
        sb.toString();

         // manipulations

         // immutable
        // final
    }

    public static void reversingEachWord(String inputString){
        String[] wo = inputString.split(" ");
        String revstring = "";
        for (int i = 0; i < wo.length; i++) {
            String singleword=wo[i];
            String revwords="";
            for (int j=singleword.length()-1;j>=0;j--) {
                revwords = revwords + singleword.charAt(j);
            }
            revstring = revstring + revwords +" ";
        }
        System.out.println("");
        System.out.println("original string: "+inputString);
        System.out.println("reverse string: "+revstring);
    }
    }

// Object
// String
// StrigBuffer
// Comparable
// Arrays
// Comprator - interface

// Exception

// Threads

