package com.yunsoft;

import com.yunsoft.Construct.*;
import com.yunsoft.Singleton.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Java Design Patterns");

	    // Singleton Patterns
	    NaiveSingleton naiveInstance = NaiveSingleton.getInstance();
	    EagerSingleton eagerInstance = EagerSingleton.getInstance();
	    LazySingleton lazySingleton = LazySingleton.getInstance();

	    // Construct Patterns
		//HelperClass helper = HelperClass.helperMethod1();
		//helper.

    }
}
