package com.designpatterns.Template;

import java.util.Scanner;

public class EmailApp {

    public static void main(String[] args) {
        System.out.println("Select Email type :");
        System.out.println("1. manager");
        System.out.println("2. HR");
        System.out.println("3. Employee");
        Scanner in = new Scanner(System.in);
        int emailType = in.nextInt();
        EmailGenerator generator = null;
        switch (emailType) {
            case 1:
                generator = new FormanagersEmailGenerator();
                break;
            case 2:
                generator = new ForHREmailGenerator();
                break;
            case 3:
                generator = new ForEmployeeEmailGenerator();
                break;
            default:
                System.out.println("Nieprawidłowy parametr");
        }
        generator.sendEmail();
    }
}
