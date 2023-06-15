package com.cistech.javafs.training.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Test {
    private int tickets = 400;

    private int capacity = 10;

    private String s = "";
    private String s2 = "";

    private List<String> list = new ArrayList<>();

    private synchronized void addPeople(String person) throws InterruptedException {
        while (list.size() == capacity)
            wait();
        synchronized (s2) {
            list.add(person);
            synchronized (s) {
                // dosomething
            }

            notifyAll();
        }
    }

    private synchronized Person removePeople() throws InterruptedException {
        while (list.size() == 0) {
            wait();
        }
        synchronized (s) {
            list.remove(1);
            synchronized (s2) {
                // do somethiong
            }
        }
        notifyAll(); // notify()
        return null;
    }

    public synchronized void giveTickets(int count)  {
        // lock - current object
        for(int i =0; i<count;i++){
            tickets--;
            try {
                Thread.sleep(1);
                // database call -> 3 seconds
                this.wait();
                this.notify();
                this.notifyAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread:"+Thread.currentThread().getName()+" "+tickets);
        }
    }

}
