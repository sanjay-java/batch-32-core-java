package com.cistech.javafs.training.week2;

public class ArrayConcept {
    // initialize
    // store the data
    // access the data
    // remove the data
    // sort, reverse , rotation, search

    // []

    static int[] numbers = new int[20];
    int numbers1[] = new int[]{1,3,4,5,6};

    public static void main(String[] args) {

        int index = 0;
        //numbers[100] = 23;
        int value = numbers[index];

        numbers[index] = 0;

        for(int i=0;i<numbers.length;i++){
            numbers[i] = i*2;
        }

        for(int i=0;i<numbers.length;i++){
            if(i %2 == 0)
                System.out.println(numbers[i]);
        }

        int i=10;
        int x=0;
        int y=1;
        System.out.print(x+","+y);
        for(int j=0;j<i-2;j++){
            y=x+y;
            System.out.print(","+y);
            x=y-x;
        }

    }
}

// ArrayIndexOutOfBoundsException

// Time complexity
// space complexity

// Big O notation

// O(n) -->
// O(n^2)
// O(logn)
// O(nlogn)
// O(1)
// O(sqrt(n)) ->

// Thread

// MultiProcess-
// multitasking -
// multithreading -
// concurrency
