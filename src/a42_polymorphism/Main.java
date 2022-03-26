/* 
 * Classe da aula 42.Polymorphism - Main
 * 26/03/2022
 * Todos os direitos reservados a Davi Souto & BroCode
 */

package a42_polymorphism;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {
	
	public static void main(String[] args) {
	
		// polymorphism = greek word for poly-"many", morph-"form"
		//				  The ability of an object to identify as more than one type
		
		Car car = new Car();
		Bicycle bike = new Bicycle();
		Boat boat = new Boat();
		
		Vehicle[] racers = {car,bike,boat}; // poderia ser Object[]
		
		for( Vehicle x : racers) { //isso aqui é mt útil e só vim entender agora kk simplesmente percorre o array de objetos pelo range do array kk
			x.go();
		}
		
	}

}
