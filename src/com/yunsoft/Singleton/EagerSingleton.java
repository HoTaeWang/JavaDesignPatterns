package com.yunsoft.Singleton;
// Using static final property of the class, to avoid multiple threads problem

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){
        System.out.println("EagerSingleton instance was created");
    }

    public static EagerSingleton getInstance(){
        return instance;
    }
}
