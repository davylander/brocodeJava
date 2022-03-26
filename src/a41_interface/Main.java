/*
 * Classe aula 41.Interface - Main
 * 26/03/2022
 * Todos os direitos reservados para Davi Souto e BroCode
 */

package a41_interface;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		// interface = a template that can be applied to a class.
		// 			   similar to inheritance, but specifies what a class has/must do.
		//			   classes can apply more than one interface, inheritance is limited to 1 super/father
		// Classe pai: animal / Interface: predador/ uma classe lobo e outra coelho s�o filhas da classe animal, pois ambas podem herdar as caracter�sticas gerais de um 
		// animal. Mas s� o lobo pode implementar a interface predador, porque n�o � todo animal que � um predador
		// Uma interface de mam�feros tamb�m se aplica ao exemplo. O lobo e o coelho podem implementar a interface Mamifero. A classe Cobra herda a classe animal e aplica
		// a interface Reptil.
		
		Rabbit rabbit = new Rabbit();
		Hawk hawk = new Hawk();
		Fish fish = new Fish();
		
		rabbit.flee();
		hawk.hunt();
		System.out.println();
		fish.hunt();
		fish.flee();
		
	}

}
