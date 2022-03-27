/*
 * Classe para aula 44 . Exception Handlig - Main
 * 26/03/2022
 * Direitos reservados a Davi Souto & BroCode
 */

package a44_exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {
	
	public static void main(String[] args) {
	
		// exception = an event that occurs during the execution of a program that,
		//			   disrupts the normal flow of intructions 
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			System.out.println("Enter a whole number to divide: ");
			int x = scanner.nextInt();
			
			System.out.println("Enter a whole number to divide by: ");
			int y = scanner.nextInt();
			
			int z = x/y;
			
			System.out.println("Result: " + z);
		}
		catch(ArithmeticException e) {
			System.out.println("You can't divide by zero! IDIOT!");
		}
		catch(InputMismatchException e) {
			System.out.println("Enter a number!! DUMB");
		}
		catch(Exception e) {
			System.out.println("Something went wrong!");
		}
		finally {
			//System.out.println("This will always print");
			scanner.close();
		}
		
	}
}
