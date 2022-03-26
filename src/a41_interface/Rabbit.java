/*
 * Classe aula 41.Interface - Rabbit
 * 26/03/2022
 * Todos os direitos reservados para Davi Souto e BroCode
 */

package a41_interface;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Rabbit extends Animal implements Prey, Mamifero{

	@Override
	public void flee() {
		System.out.println("The rabbit is fleeing");
	}
	
	public void move() {
		
	}
	
	public void sleep() {
		
	}
	
	public void makeMilk() {
		
	}
	
}
