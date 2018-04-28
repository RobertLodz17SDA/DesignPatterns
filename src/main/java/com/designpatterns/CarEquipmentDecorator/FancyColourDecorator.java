package com.designpatterns.CarEquipmentDecorator;

public class FancyColourDecorator implements CarEquipment{

    private CarEquipment carEquipment = null;

    public FancyColourDecorator(CarEquipment carEquipment) {
        this.carEquipment = carEquipment;
    }

    public void addAdditionalEquipment() {
        carEquipment.addAdditionalEquipment();
        System.out.println("Added Fancy colour");

    }
}
