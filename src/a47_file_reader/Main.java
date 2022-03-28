/*
 * Classe para a aula 47. File Reader - Main
 * 28/03/2022
 * Todos os direitos autorais para Davi Souto & BroCode
 */

package a47_file_reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 * @version 1.0
 * @author Davi Souto Neri - BroCode Bootcamp Java
 */

public class Main {

	public static void main(String[] args) {
		// FileReader = read the content of a file as a  stream of characters. One by one 
		//				read() returns a int value which contains the byte value
		//				when read() returns -1, there is no more data to be read
		
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
