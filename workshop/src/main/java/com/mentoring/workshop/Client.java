package com.mentoring.workshop;


/**
 * Main class, can interact with Workshop
 */
public class Client {
    //TODO what happened with visibility????????????
    //private Client client;
    //private Car car;
    //private Workshop workshop;
    //client = new Client();  //TODO WHY ERROR????????????????

    //public Client(Car car){
      //  this.car = car;
    //}

    private Car car = new Car();
    private Client client = new Client();
    private Workshop workshop = new Workshop(car, true);

    //TODO WHY ERROR??????? workshop.getCarStatus




}
