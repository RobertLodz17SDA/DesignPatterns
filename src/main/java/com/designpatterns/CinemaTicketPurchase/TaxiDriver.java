package com.designpatterns.CinemaTicketPurchase;

public class TaxiDriver implements TicketPurchase {

    @Override
    public double purchaseTicket() {
        System.out.println("Go to see TaxiDriver ...");
        return 10;
    }
}
