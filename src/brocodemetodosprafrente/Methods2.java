package brocodemetodosprafrente;

public class Methods2 {

	public static void main(String[] args) {
		// method = a block of code that is executed whenever it is called upon
		
		int x = 3;
		int y = 4;

		int z = add(x,y);
		
		System.out.println(z);
		
		System.out.println(add2(x,y));
		
	}
	
	static int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	static int add2(int x, int y) {
		return x + y;
	}

}
