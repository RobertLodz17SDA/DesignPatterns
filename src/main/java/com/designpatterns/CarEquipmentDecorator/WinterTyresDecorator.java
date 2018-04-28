package com.designpatterns.CarEquipmentDecorator;

public class WinterTyresDecorator implements CarEquipment {

    public CarEquipment carEquipment = null;

    public WinterTyresDecorator(CarEquipment carEquipment) {
        this.carEquipment = carEquipment;
    }

    public void addAdditionalEquipment() {
        carEquipment.addAdditionalEquipment();
        System.out.println("Added Winter Tyres to car equipment");
    }
}
