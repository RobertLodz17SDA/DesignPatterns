package com.designpatterns.Pizzeria;

public class PizzaFactory {

    public BakePizza bakePizzaAsRequested(int pizzaChoice) {
        switch (pizzaChoice) {
            case 1 : return new MakeMargherita();
            case 2 : return new MakeCapriciosa();
            case 3 : return new MakeVegetariana();
            case 4 : return new MakeCarbonara();
            case 5 : return new MakeQuattroStagioni();
            default : return new MakeJustPizza();
        }

    }
}
