package a43_dynamicPolymorphism;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// polymorphism = many shapes/forms
		// dynamic = afet compilation (during runtime)
		
		// ex. A corvette ia a: corvette, and a car, and a vehicle, and a object
		// ex. Cobra é: cobra, réptil, animal, object
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		
		System.out.println("What animal do you want?");
		System.out.println("1 - Dog");
		System.out.println("2 - Cat");
		int choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else if (choice == 2){
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("That choice was invalid");
			animal.speak();
		}
		
	}

}
