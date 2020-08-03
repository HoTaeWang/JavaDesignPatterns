package com.yunsoft.Singleton;

public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton(){
        System.out.println("LazySingleton instance was created.");
    }

    public static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
