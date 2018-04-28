package com.designpatterns.CinemaTicketPurchase;

public class LordOfTheRings implements TicketPurchase {

    @Override
    public double purchaseTicket() {
        System.out.println("Go to see Lord Of The Rings ...");
        return 20.00;
    }
}
