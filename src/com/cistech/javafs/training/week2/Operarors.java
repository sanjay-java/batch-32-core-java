package com.cistech.javafs.training.week2;

public class Operarors {

    private static int  instanceV = 100;

    public static void main(String[] args){
        System.out.println(reverseDigits(12345));
        System.out.println(reverseDigits(100));
        System.out.println(reverseDigits(0));

        int x = 12;
        if(x<10) {
            int y = 5;
        }
        // x%y
        // x/y

        // logical operators

        // &&
        //  ||
        //  !
        //  =

        //  ==
        //  !=
        // >  <  <+  >=

        //  =, +=, -=, *=, /=, %=
        
        int x1 = 5;
        x += 3;

        // if
        // else
        // else if
        // switch
        


         reverseDigits(x);
        int f1 = 0;
        int f2 = 1;
        int counter = 0;

        while (counter < 10)
        {
            System.out.println(f1);
            int f3 = f1 + f2;
            f1  = f2;
            f2 = f3;
            counter++;
        }


    }

    private static int reverseDigits(int x) {
        int z = x>5?x:x<5?x-1:0;

        if(x > 5){
            return x;
        }else if(x <5){
            return x - 1;
        }
        int i =0;
        for(;;){
            if(i == 100)
                break;
        }
        return 0;
    }

    // loops

    // for
    // while
    // do while

    // initialize
    // conditional
    // increment



}
