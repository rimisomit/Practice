package com.mentoring.workshop;

import sun.misc.Cleaner;

import java.util.PriorityQueue;

/**
 * Main class, can interact with Workshop
 */
public class Client {
    //TODO what happened with visibility
    private Client client;
    private Car car;
    private Workshop workshop;
    //client = new Client();  //TODO WHY ERROR?
    public Client(Car car){
        car = new Car();
        client = new Client(car);
        workshop = new Workshop(car, true);
    }



}
