/*
 * Classe auxiliar da aula Super Keyword - Hero
 * 22/03/2022
 * Todos os direitos autorais para Davi Souto & BroCode
 */

package classSuperKeyword;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Hero extends Person {

	String power;
	
	Hero(String name, int age, String power){
		super(name, age); // aqui ele passa os valores especificados dos atributos recebidos no construct Hero para os atributos de Person
		this.power = power;
	}
	
	public String toString() {
		return super.toString() + this.power + "\n"; // aqui este método está chamando o método do pai somado com atributos próprios
	}
	
}
