package com.cistech.javafs.training.week3;

import java.util.concurrent.*;

public class MultiThreadClass {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        long currentTime = System.currentTimeMillis();
        Test t  = new Test();
        // t.printNumbers();
        System.out.println("Time Taken without threads: "+(System.currentTimeMillis()-currentTime));

        long startTime = System.currentTimeMillis();
        FirstThread first = new FirstThread(t);
        first.start();

        FirstThread second = new FirstThread(t);
        second.start();

        first.join();
        second.join();
        System.out.println("Time Taken with threads: "+(System.currentTimeMillis()-startTime));

        // pool of threads

        ScheduledExecutorService ex = Executors.newScheduledThreadPool(10);
        ex.schedule(new Runnable() {
            @Override
            public void run() {
                // t.giveTickets(50);
            }
        }, 5,TimeUnit.SECONDS);

        // Callable
        for(int i =0; i<100;i++) {
            Future<Test> ret = ex.submit(new Callable<Test>() {
                @Override
                public Test call() throws Exception {
                    return null;
                }
            });
        }
    }

}

// NEW
// START - RUNNABLE
// RUN - RUNNING
// WAIT -
// BLOCKED
// DEAD

// EXECUTORS FRAMEWORK
// CALLABLE
// FUTURE

// REENTRANT LOCK
// SEMAPHORES
// DEADLOCK

