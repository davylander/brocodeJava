package javabrocode;
import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		
		
		double a = 3.14;
		double b = -10;
		double f = 16;
		
		double c  = Math.max(a, b); // compara os números e envia o maior
		double d = Math.min(a, b); // compara os números e envia o menor
		double e = Math.abs(b); // número absoluto, torna um negativo em positivo
		double g = Math.sqrt(f); // raiz de um numero
		double h = Math.round(a); // arredonda o número fracionado para o decimal mais próximo
		double i = Math.ceil(a); // arredonda o número para cima
		double j = Math.floor(a); // arredonda o número para baixo
		
		
		System.out.println("O maior número é : " + c);
		System.out.println("O menor número é : " + d);
		System.out.println("O número absoluto de " + b + " é : " + e);
		System.out.println("A raiz de " + f +  " é : " + g);
		System.out.println("Arrendodando " + a + " o resultado é: " + h);
		System.out.println("Arrendodando " + a + " para cima o resultado é: " + i);
		System.out.println("Arrendodando " + a + " para baixo o resultado é: " + j);
		
		System.out.println("");
		System.out.println("______________________________________________________");
		System.out.println("");
		
		//________________________________________
		
		System.out.println("Encontrando a hipotenusa:");
		
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);  
		
		System.out.println("Insira o lado x: ");
		x  = scanner.nextDouble();
		System.out.println("Insira o lado y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x*x)+(y*y));
		
		System.out.println("A hipotenusa é : " + z);
		
		scanner.close();
		
	}

}
