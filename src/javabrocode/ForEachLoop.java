package javabrocode;
import java.util.ArrayList;
public class ForEachLoop {

	public static void main(String[] args) {
		// for-each = traversing technique to iterate through the elements in a array/collection
		// 				less steps, more readable
		//				less flexible
		
		String[] animals = {"cat", "dog", "rat", "bird"};
		
		for(String i : animals) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("___________________For-Each Loop with ArrayList___________________");
		System.out.println();
		
		ArrayList<String> animais = new ArrayList<String>();
		
		animais.add("gato");
		animais.add("cachorro");
		animais.add("rato");
		animais.add("pássaro");
		
		for(String i : animais) {
			System.out.println(i);
		}

	}

}
