package com.yunsoft;

import com.yunsoft.Construct.*;
import com.yunsoft.Construct.AbstractFactory.*;
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
		System.out.println("=========== Factory Pattern =========== ");
		System.out.println("provides an interface for creating families of related\n objects without specifying their concreate classes.");
		shapeFactoryPatternDemo();
		abstractFactoryDesignPatternDemo();
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

	private static void shapeFactoryPatternDemo(){
		ShapeFactory shapeFactory = new ShapeFactory();

		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();

		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();

		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
	}

	private static void abstractFactoryDesignPatternDemo(){
		AbstractFactory abstractFactory;

		System.out.println("Abstract Factory Pattern");
		// create a Brown Toy Dog
		abstractFactory = FactoryProvider.getFactory("Toy");
		Animal animal = (Animal)abstractFactory.create("Dog");

		abstractFactory = FactoryProvider.getFactory("Color");
		Color color = (Color) abstractFactory.create("Brown");

		String result = "A " + animal.getType() + " with " + color.getColor() + " color " + animal.makeSound();
		System.out.println(result);
	}

}
