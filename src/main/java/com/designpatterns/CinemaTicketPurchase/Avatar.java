package com.designpatterns.CinemaTicketPurchase;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Avatar implements TicketPurchase {

    @Override
    public double purchaseTicket() {
        System.out.println("Go to see Avatar ...");
        return 15.00;
    }
}
