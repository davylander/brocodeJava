package javabrocode;

public class ForLoop {

	public static void main(String[] args) {
		
		// for loop = executes  block of code a limited amount of times
		
		for(int index = 20; index>=0; index-=5) {
			System.out.println(index);
		}
		
		System.out.println("Happy new year!");
		
		System.out.println("_____________________________________________________________________");
		
		int x = 2;
		double amazon = 351.25 + 34.22 + 109.90 + 78.0 + 93.90;
		double parcelado = amazon/x;
		
		System.out.println("O valor da compra total, que é R$ " + amazon + ", parcelado em " + x + "x na Amazon = " + parcelado);
	}

}
