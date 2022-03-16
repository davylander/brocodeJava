package brocodemetodosprafrente;

public class Methods {

	public static void main(String[] args) {
		// method = a block of code that is executed whenever it is called upon
		
		String name = "Davi";
		int age = 23;
		
		for(int i=0; i<=0; i++) {
			hello(name, age);
		}
		
	}
	
	static void hello(String title, int idade) {
		System.out.println("Hello, " + title + "! \n"
							+ "You have " + idade + " years old, and you still have so much time to do amazing things :)");
	}

}
