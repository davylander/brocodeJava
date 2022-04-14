/*
 * Classe para aula 74. Generics Classes - Main
 * 13/04/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a74_generic_classes;

import java.util.ArrayList;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		/*
		MyIntegerClass myInt = new MyIntegerClass(1);
		MyDoubleClass myDouble = new MyDoubleClass(3.14);
		MyCharacterClass myChar = new MyCharacterClass('@');
		MyStringClass myString = new MyStringClass("Hello");
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		*/
		
		MyGenericClass <Integer,Integer, Integer> myInt = new MyGenericClass<>(1,2,4);
		MyGenericClass <Double,Double, Double> myDouble = new MyGenericClass<>(3.14,4.13, 5.13);
		MyGenericClass <Character,Character, Integer> myChar = new MyGenericClass<>('@','#', 2);
		MyGenericClass <String,String, Double> myString = new MyGenericClass<>("Hello","World", 55.2);
		
		ArrayList<String> myFriends = new ArrayList<>();
		
		System.out.println(myInt.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myChar.getValue());
		System.out.println(myString.getValue());
		
		// bounded types = you can create the objects of a generic class to have data of specific derived types ex.: Number
	}

}
