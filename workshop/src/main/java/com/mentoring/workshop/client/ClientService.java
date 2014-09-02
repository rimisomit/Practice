package com.mentoring.workshop.client;

/**
 * Created by user on 8/25/14.
 */
public interface ClientService {
    void receiveOrder(Client client);

    void releaseOrder(Client client);
}
