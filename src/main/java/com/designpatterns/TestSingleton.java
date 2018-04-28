package com.designpatterns;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getinstance();
        Singleton singleton1 = Singleton.getinstance();
        Singleton singleton2= Singleton.getinstance();
    }
}
