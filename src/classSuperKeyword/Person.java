/*
 * Classe auxiliar da aula Super Keyword - Person
 * 22/03/2022
 * Todos os direitos autorais para Davi Souto & BroCode 
 */

package classSuperKeyword;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Person {

	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return this.name + "\n" + this.age + "\n";
	}
	
}
