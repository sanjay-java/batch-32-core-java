package com.cistech.javafs.training.week3;

import java.util.function.Consumer;

public class PersonPrinterImpl implements PersonPrinter{

    @Override
    public void printPerson(Person p) {
        System.out.print(p.toString());
    }
}
