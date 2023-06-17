package com.cistech.javafs.training.week3;

import java.util.concurrent.*;

public class SumOfNumbers {

    public static void main(String[] args) {

        int[] numbers = new int[115];
        for(int i =0;i<numbers.length;i++)
        {
            numbers[i] = i+1;
        }

        int numThreads = 4;
        int size = numbers.length/numThreads;
        int sum = 0;
        ExecutorService ex = Executors.newFixedThreadPool(numThreads);

        for(int i=0; i<numbers.length;){
            System.out.print("i"+ i);
            int start = i;
            int end = start+size;
            i = end;
            System.out.print("start"+ start);
            System.out.print("end"+ end);
            System.out.print("i"+ i);
            Future<Integer> totalThread = ex.submit(new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    int total = 0;
                    for(int k = start; k<end && k<numbers.length;k++){
                        total += numbers[k];
                    }
                    return total;
                }
            });
            try {
                sum += totalThread.get();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Sum of elements in Array"+sum);

    }

}
