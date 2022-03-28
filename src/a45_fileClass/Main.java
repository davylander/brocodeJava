/*
 * Classe para aula 45. File class - Main
 * 28/03/2022
 * Todos os direitos reservados a Davi Souto e BroCode
 */

package a45_fileClass;

import java.io.File;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		// file = An abstract representation of file and directory pathnames
		
		File file = new File("secret_message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists! :O");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
			//file.delete();
		}
		else {
			System.out.println("That fle doesn't exist! :(");
		}
	
	}

}
