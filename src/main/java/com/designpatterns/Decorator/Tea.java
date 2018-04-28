package com.designpatterns.Decorator;

import java.util.HashSet;

public class Tea implements HotDrink {

    public void prepare(){
        System.out.println("Preparing tea ....");
    }
}
