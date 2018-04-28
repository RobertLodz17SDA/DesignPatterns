package com.designpatterns.CarEquipmentDecorator;

import com.sun.org.apache.xpath.internal.SourceTree;

public class LeatherSeatsDecorator implements CarEquipment {

    private CarEquipment carEquipment = null;

    public LeatherSeatsDecorator(CarEquipment carEquipment) {
        this.carEquipment = carEquipment;
    }

    public void addAdditionalEquipment() {
        carEquipment.addAdditionalEquipment();
        System.out.println("Added Leather seats >>>");
    }
}
