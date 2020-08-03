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
		constructPatterns();
	}
	
	void constructPatterns(){
		int a = 37;
		int b = 39;

		// HelperClass
		System.out.println(a + " is prime: " + HelperClass.isPrime(a));
		System.out.println(b + " is prime: " + HelperClass.isPrime(b));	
	}
}
