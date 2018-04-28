package com.designpatterns.Decorator;

public class MilkDecorator implements HotDrink {

    public MilkDecorator(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    private HotDrink hotDrink;


    public void prepare() {
        hotDrink.prepare();
        System.out.println(" Milk added ...");
    }
}
