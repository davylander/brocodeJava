package classMethodOverriding;

public class Dog extends Animal {

	
	@Override //importante para boas práticas! Lembrar sempre de usar.
	void speak() {
		System.out.println("The dog goes *bark*");
	}
	
}
