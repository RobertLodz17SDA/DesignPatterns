package com.designpatterns.CarBuilder;

import java.util.Arrays;

public class CarApp {
    public static void main(String[] args) {
        Car car1 = new Car.CarBuilder().builder()
                .company("Toyota")
                .countryofOrigin("Japan")
                .engine(1.8).build();
        Car car2 = new Car.CarBuilder().builder()
                .engineType(CarEngineTypes.Diesel)
                .company("Ford")
                .countryofOrigin("USA")
                .year(2010).build();
        Car car3 = new Car.CarBuilder().builder()
                .engineType(CarEngineTypes.Gasoline)
                .company("Mazda")
                .countryofOrigin("Korea")
                .year(2010)
                .millege(123000)
                .additionalFeatures(Arrays.asList("Leather seats", "Roof window", "5 Doors"))
                .build();
    }
}
