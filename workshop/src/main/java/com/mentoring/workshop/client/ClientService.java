package com.mentoring.workshop.client;

interface ClientService {
    void receiveOrder(Client client, boolean toRepair);

    void releaseOrder(Client client);
}
