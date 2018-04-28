package com.designpatterns.Strategy;

import java.util.Scanner;

public class KnightApp {

    public static void main(String[] args) {

        Knight knight = new Knight(new KillDragonQuest());

        System.out.println("Choose Quest to do");
        System.out.println("1. Default Quest - kill the Dragon");
        System.out.println("2. Save the Queen");
        System.out.println("3. Burn the city");

        Scanner in = new Scanner(System.in);
        int quest = in.nextInt();

        switch (quest) {
            case 1 :
                knight.play();
                break;
            case 2:
                knight.setQuest(new SaveTheQueenQuest());
                knight.play();
                break;
            case 3:
                knight.setQuest((new BurnTheCityQuest()));
                knight.play();
                break;
        }
    }
}
