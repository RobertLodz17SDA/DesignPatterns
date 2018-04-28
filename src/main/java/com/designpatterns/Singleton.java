package com.designpatterns;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton(){

    }

    public static Singleton getinstance(){
        if ( singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }

    public int testSingleton(){
        System.out.println("I am here");
        return 5;
    }


}
