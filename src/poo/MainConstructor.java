package poo;

public class MainConstructor {

	public static void main(String[] args) {
		// constructor = special method that is called when a object is instantied (created)
		
		Human human1 = new Human("Davi", 23, 80.50);
		Human human2 = new Human("Clara", 23, 60.50);
		
		System.out.println(human1.name);
		System.out.println(human2.name);

		human2.eat();
		human1.drink();
		
	}

}
