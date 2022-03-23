/*
 * Classe auxiliar da aula Super Keyword - Main
 * 22/03/2022
 * Todos os direitos autorais para Davi Souto & BroCode 
 */

package classSuperKeyword;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		// super = keyword refers to the superclass (parent) of an object
		//		   very similar to the "this" keyword
		
		Hero hero1 = new Hero("Batman 'Robert Pattinson'", 29, "$$$ Detective Ninja $$$");
		Hero hero2 = new Hero("Superman", 35, "Super strenght, super speed, flight, laser beam");

		/*
		System.out.println("Nome  do herói: " + hero1.name);
		System.out.println("Idade do herói: " + hero1.age);
		System.out.println("Poder do herói: " + hero1.power);
		*/
		
		System.out.println(hero2.toString());
		
	}

}
