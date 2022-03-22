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

public class Vehicle {
	
	String model = "vehicle";
	double speed;
	
	void go() {
		System.out.println("This " + model + " is moving");
	}
	
	void stop() {
		System.out.println("This " + model + " is stopped");
	}

}
