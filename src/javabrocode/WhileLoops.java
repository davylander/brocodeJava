package javabrocode;

import java.util.Scanner;

public class WhileLoops {

	public static void main(String[] args) {

		// while loop = executes  block of code as long as a it's condition remains true
		
		Scanner scanner = new Scanner(System.in);
		String name = "";
		
		/*
		do{
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}while(name.isBlank());
		*/
		while(name.isBlank()) {
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
		}
		System.out.println("Hello " + name);
		
	}

}
