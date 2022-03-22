/*
 * Classes da aula sobre Herança
 * 22/03/2022
 * Todos os direitos autorais para Davi Souto e BroCode
 */

package classInheritance;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Inheritance {

	public static void main(String[] args) {
		/*
		 * inheritance = the process where one class acquires, the attributes and methods of another.
		 */
		
		Car car = new Car("Celta 2004");
		Bicycle bike = new Bicycle("Bikezinha");
		
		car.go();
		car.stop();

		System.out.println();
		
		bike.go();
		bike.stop();
		
		System.out.println();
		
		System.out.println(car.doors);
		System.out.println(bike.pedals);
		
	}

}
