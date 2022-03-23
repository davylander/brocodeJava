/*
 * Classe da aula Method Overriding
 * 22/03/2022
 * Todos os direitos autorais para Davi Souto e BroCode
 */

package classMethodOverriding;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Dog extends Animal {

	
	@Override //importante para boas práticas! Lembrar sempre de usar.
	void speak() {
		System.out.println("The dog goes *bark*");
	}
	
}
