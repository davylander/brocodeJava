package javabrocode;
import java.util.Scanner;

public class MathClass {

	public static void main(String[] args) {
		
		
		double a = 3.14;
		double b = -10;
		double f = 16;
		
		double c  = Math.max(a, b); // compara os n�meros e envia o maior
		double d = Math.min(a, b); // compara os n�meros e envia o menor
		double e = Math.abs(b); // n�mero absoluto, torna um negativo em positivo
		double g = Math.sqrt(f); // raiz de um numero
		double h = Math.round(a); // arredonda o n�mero fracionado para o decimal mais pr�ximo
		double i = Math.ceil(a); // arredonda o n�mero para cima
		double j = Math.floor(a); // arredonda o n�mero para baixo
		
		
		System.out.println("O maior n�mero � : " + c);
		System.out.println("O menor n�mero � : " + d);
		System.out.println("O n�mero absoluto de " + b + " � : " + e);
		System.out.println("A raiz de " + f +  " � : " + g);
		System.out.println("Arrendodando " + a + " o resultado �: " + h);
		System.out.println("Arrendodando " + a + " para cima o resultado �: " + i);
		System.out.println("Arrendodando " + a + " para baixo o resultado �: " + j);
		
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
		
		System.out.println("A hipotenusa � : " + z);
		
		scanner.close();
		
	}

}
