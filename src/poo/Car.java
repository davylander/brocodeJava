package poo;

public class Car {
	
	String make = "Ford";
	String model = "Mustang";
	String color = "red";
	int year = 2021;
	double price = 50000.00;
	
	public String toString() {
		return make +"\n"+model+"\n"+color+"\n"+year;
	}
	
	void drive() {
		System.out.println("You drive the car");
	}
	
	void brake() {
		System.out.println("You step on the brakes");
	}
	
}
