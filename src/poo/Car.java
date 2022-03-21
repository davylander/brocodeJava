package poo;

public class Car {
	
	String make;
	String model;
	String color;
	int year;
	double price;
	
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	
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
