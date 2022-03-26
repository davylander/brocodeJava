/*
 * Classe aula 41.Interface - Fish
 * 26/03/2022
 * Todos os direitos reservados para Davi Souto e BroCode
 */

package a41_interface;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Fish implements Prey,Predator{

	public void flee() {
		System.out.println("The fish is fleeing from a larger fish");
	}
	
	public void hunt() {
		System.out.println("The fish is hunting smaller fish");
	}
	
}
