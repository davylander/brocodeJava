/*
 * Classe da aula 46. File Writer - Main
 * 28/03/2022
 * Todos os direitos reservados para Davi Souto e BroCode
 */

package a46_file_writer;

import java.io.FileWriter;
import java.io.IOException;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red \n"
					+ "Violets are blue \n"
					+ "Booty booty booty and booooty \n"
					+ "Rockin' everywhere!");
			writer.append("\n(A poem by DavyBro)");
			writer.close();
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
