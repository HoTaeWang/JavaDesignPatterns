package com.yunsoft;

import com.yunsoft.Construct.*;
import com.yunsoft.Singleton.*;

public class Main {

    public static void main(String[] args) {
	    System.out.println(">>>>>>>>>>>>>>>>>> Java Design Patterns <<<<<<<<<<<<<<<<<<");

		System.out.println("=========== Singleton =========== ");
	    // Singleton Patterns
	    NaiveSingleton naiveInstance = NaiveSingleton.getInstance();
	    EagerSingleton eagerInstance = EagerSingleton.getInstance();
	    LazySingleton lazySingleton = LazySingleton.getInstance();

	    // Construct Patterns
		constructPatterns();
	}
	
	private static void constructPatterns(){
		int a = 37;
		int b = 39;
		int c = (-2);

		System.out.println("=========== HelperClass =========== ");
		// HelperClass
		System.out.println(a + " is prime: " + HelperClass.isPrime(a));
		System.out.println(b + " is prime: " + HelperClass.isPrime(b));
		System.out.println(c + " is positive(T/F)? " + HelperClass.isPositive(c));

		for(int i=2;i<20;i++){
			System.out.println("Prime Number : " + i + " = " + HelperClass.isPrime(i) );
		}
		System.out.println(" 5th Prime Number = " + HelperClass.nthPrimeNumber(5));
	}
}
