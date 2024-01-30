package com.pers;

import com.pers.Work;

public class MainWork {

    private final static Work work = new Work();

    public static void main(String[] args) {
        doMainWork();
    }

    public static void doMainWork() {
        System.out.println("Current value is " + work.doWork());
    }

}
