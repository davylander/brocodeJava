package classMethodOverriding;

public class Dog extends Animal {

	
	@Override //importante para boas pr�ticas! Lembrar sempre de usar.
	void speak() {
		System.out.println("The dog goes *bark*");
	}
	
}
