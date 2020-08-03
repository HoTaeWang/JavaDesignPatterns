package com.yunsoft.Construct;

public class HelperClass {
    private HelperClass() {
        System.out.println("HelperClass was created.");
    }

    public static void helperMethod1(){
        System.out.println("helperMethod1 was invoked.");
    }

    public static void helperMethod2(){
        System.out.println("helperMethod2 was invoked.");
    }
}
