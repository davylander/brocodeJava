/*
 * Classe da aula 39 Encapsulation - Main
 * 24/03/2022
 * Todos os direitos reservados a Davi Souto Neri e BroCode
 */

package encapsulation_39;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		// Encapsulation = attributes of a class will be hidden or private,
		//				   Can be accessed only through methods (getters & setters)
		//				   You should make attributes private if you don't have reason to make them public/protected
		
		Car car = new Car("Chevrollet", "Camaro", 2021);
		
		car.setYear(2022);
		
		System.out.println(car.getMake());
		System.out.println(car.getModel());
		System.out.println(car.getYear());
		
	}

}
