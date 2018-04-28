package com.designpatterns.CarBuilder;

import java.util.List;

public class Car {

    private String company;
    private String model;
    private double engine;
    private int year;
    private long millage;
    private String countryofOrigin;
    private List<String> additionalFeatures;
    private CarEngineTypes engineType;


    public Car(String company, String model,
               double engine, int year, long mealage,
               String countryofOrigin, List<String> additionalFeatures,
               CarEngineTypes enginetype) {
        this.company = company;
        this.model = model;
        this.engine = engine;
        this.year = year;
        this.millage = millage;
        this.countryofOrigin = countryofOrigin;
        this.additionalFeatures = additionalFeatures;
        this.engineType = engineType;
    }

    public static class CarBuilder{
        private String company;
        private String model;
        private double engine;
        private int year;
        private long millege;
        private String countryofOrigin;
        private List<String> additionalFeatures;
        private CarEngineTypes engineType;

        public static CarBuilder builder(){
            return new CarBuilder();
        }

        public CarBuilder company(String company){
            this.company = company;
            return this;
        }

        public CarBuilder model(String model){
            this.model = model;
            return this;
        }

        public CarBuilder engine(double engine){
            this.engine = engine;
            return this;
        }

        public CarBuilder year(int year){
            this.year = year;
            return this;
        }

        public CarBuilder millege(long millege){
            this.millege = millege;
            return this;
        }

        public CarBuilder countryofOrigin(String countryOfOtigin){
            this.countryofOrigin = countryOfOtigin;
            return this;
        }

        public CarBuilder additionalFeatures(List<String> additionalFeatures){
            this.additionalFeatures = additionalFeatures;
            return this;
        }

        public CarBuilder engineType(CarEngineTypes engineType){
            this.engineType = engineType;
            return this;
        }

        public Car build(){
            return new Car(company,model,engine,year,millege, countryofOrigin,additionalFeatures, engineType);
        }
    }
}




