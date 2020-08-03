package com.yunsoft.Singleton;

public class NaiveSingleton {
    private static NaiveSingleton instance;

    private NaiveSingleton() {
        System.out.println("NaiveSingleton instance was created");
    }

    public static NaiveSingleton getInstance(){
        if(instance == null){
            instance = new NaiveSingleton();
        }
        return instance;
    }
}
