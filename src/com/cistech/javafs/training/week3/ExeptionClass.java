package com.cistech.javafs.training.week3;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExeptionClass {
    // interruption
    // log exeption
    // throw custom exception.

    public static void main(String[] args) {

        try {
            doStuff();
        }catch (Exception e){

        }
    }

    private static void doStuff() throws Exception{
        Person p = null;
        double d = 0;
        FileInputStream fis = null;
        try {
            d = p.calculateBMI();
            File f = new File("/users/svemireddy/some.txt");
            fis = new FileInputStream(f);
            System.out.print("some work");
        }catch(FileNotFoundException | IllegalArgumentException e){
            System.out.println("File not found for person name "+ p.toString()); // xyz
        }
        catch(Exception e){
            e.getMessage();
            e.printStackTrace();
            System.out.println("Height missing for person name "+ p.toString()); // xyz
            throw e;
        }
        finally{
            // always executed
            fis.close();
        }

        if(d > 26)
        {
            System.out.println("obese");
        }
        else if(d > 18){
            System.out.println("average");
        }else
            System.out.print("slim");

        System.out.println("name is "+p.getName());

//        try(FileInputStream fis2 = new FileInputStream(new File("some"))
//        {
//
//        }

    }



}


// try with resources

