package com.designpatterns.CarEquipmentDecorator;

import java.util.Scanner;

public class CarDealerConfigurator {

    public static void main(String[] args) {

        printMainMenu();
        Scanner scanner = new Scanner(System.in);
        int carChoice = scanner.nextInt();
        CarEquipment carBrand = null;

        switch (carChoice) {
            case 1:
                carBrand = new Honda();
                break;
            case 2:
                carBrand = new Toyota();
                break;
            case 3:
                carBrand = new Volkswagen();
                break;
            default:
                System.out.println("Niepoprawna opcja");
        }
        printExtras();
        int extrasNumber = scanner.nextInt();
        while (extrasNumber != 4) {
            switch (extrasNumber) {
                case 1:
                    carBrand = new LeatherSeatsDecorator(carBrand);
                    break;
                case 2:
                    carBrand = new FancyColourDecorator(carBrand);
                    break;
                case 3:
                    carBrand = new WinterTyresDecorator(carBrand);
                    break;
                default :
                        System.out.println("niepoprawna opcja");
                        break;
            }
            printExtras();
            extrasNumber = scanner.nextInt();
        }
        carBrand.addAdditionalEquipment();

    }

    private static void printExtras() {
        System.out.println("Add extras : ");
        System.out.println("1. Leather seats");
        System.out.println("2. Fancy colour");
        System.out.println("3. Winter Tyres");
        System.out.println("4. END");
    }

    private static void printMainMenu() {
        System.out.println("Hello, choose car to configure : ");
        System.out.println("1. Honda");
        System.out.println("2. Toyota");
        System.out.println("3. Volkswagen");
    }
}

