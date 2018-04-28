package com.designpatterns.CinemaTicketPurchase;

public class Predator implements TicketPurchase {

    @Override
    public double purchaseTicket() {
        System.out.println("Go to see Predator ...");
        return 15;
    }
}
