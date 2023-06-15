package com.cistech.javafs.training.week3;

public class FirstThread extends Thread{

//    private String name;
//
//    private int start;
//    private int end;

    private Test t;
    public FirstThread(Test t){
       this.t = t;
    }

    @Override
    public void run(){
        t.giveTickets(200);
    }

}
