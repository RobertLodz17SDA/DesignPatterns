package com.designpatterns.Decorator;

public class ToppingDecorator implements HotDrink {

    public HotDrink hotDrink;

    public ToppingDecorator(HotDrink hotDrink) {
        this.hotDrink = hotDrink;
    }

    public void prepare() {
        hotDrink.prepare();
        System.out.println("Topping added ...");
    }
}
