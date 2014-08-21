package com.mentoring.workshop.todelete;

import java.util.Date;

import static java.lang.Thread.sleep;


public final class TimeTest {

    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        sleep(5000);
        Date date1 = new Date();

        System.out.println(date + " " + date1);
        System.out.println((date1.getTime()-date.getTime())/1000);
    }

}
