/*
 * Classes da aula sobre Herança
 * 22/03/2022
 * Todos os direitos autorais para Davi Souto e BroCode
 */

package classMethodOverriding;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		/*
		 *  method overriding = Deckaring a method in sub class,
		 *   					whic is alredy present in parent class.
		 *   					done so that child class can give its own implementation
		 */
		
		Animal animal = new Animal();
		Dog dog = new Dog();
		
		animal.speak();
		dog.speak();

	}

}
