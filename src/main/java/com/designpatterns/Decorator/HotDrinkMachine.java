package com.designpatterns.Decorator;

import java.util.Scanner;

public class HotDrinkMachine {

    public static void main(String[] args) {
        PrintMainMenu();
        Scanner scanner = new Scanner(System.in);
        int drinkNumber = scanner.nextInt();
        HotDrink hotDrink = null;

        switch (drinkNumber) {
            case 1:
                hotDrink = new Coffee();
                break;
            case 2:
                hotDrink = new Tea();
                break;
            case 3:
                hotDrink = new Chocolate();
                break;
            default:
                System.out.println(" Nie ma takiego drinka w Menu !");
        }
        printExtras();
        int extrasNumber = scanner.nextInt();
        while (extrasNumber != 4) {
            switch (extrasNumber) {
                case 1:
                    hotDrink = new SugarDecorator(hotDrink);
                    break;
                case 2:
                    hotDrink = new MilkDecorator(hotDrink);
                    break;
                case 3:
                    hotDrink = new ToppingDecorator(hotDrink);
                    break;
            }
            printExtras();
            extrasNumber = scanner.nextInt();
        }
        hotDrink.prepare();

    }

    private static void printExtras() {
        System.out.println("Add extras : ");
        System.out.println("1. Sugar");
        System.out.println("2. Milk");
        System.out.println("3. Cacao Topping");
        System.out.println("4. END");
    }

    private static void PrintMainMenu() {
        System.out.println("Hello, choose drink : ");
        System.out.println("1. Coffee");
        System.out.println("2. Tea");
        System.out.println("3. Chocolate");
    }
}
