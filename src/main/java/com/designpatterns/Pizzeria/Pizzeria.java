package com.designpatterns.Pizzeria;

import java.util.Scanner;

public class Pizzeria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What kind of Pizza would you like to have ?");
        System.out.println("1. Margherita");
        System.out.println("2. Capriciosa");
        System.out.println("3. Vegetariana");
        System.out.println("4. CArbonara");
        System.out.println("5. QuattroStagioni");
        System.out.println("or other for just pizza bottom with cheese ");

        PizzaFactory pizzeria = new PizzaFactory();
        int i = scanner.nextInt();

        BakePizza bakePizza = pizzeria.bakePizzaAsRequested(i);
        bakePizza.showIngredients();

    }
}
