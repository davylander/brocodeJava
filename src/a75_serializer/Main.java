package a75_serializer;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//  SÓ FUNCIONA EM PROJETOS DIFERENTES 

		/*
		 * Serialization = the process of convert an object into a byte stream.
		 * 					Persists (save the state) the objetct after program exits
		 * 					This byte stream can be saved as a file or sent over a network
		 * 					Can be sent to a different machine
		 * 					Byte stream can be saved as a file (.ser) which is platform independet
		 * 					(Think of this as if you're saving a file with the object's information)
		 * 
		 * Deserialization = The reverse process of converting a byte stream into an object.
		 * 					 (think of this as if you're loading a saved file)
		 */
		
		/*
		 *    Steps to Serialize
		                        1. Your object class should implement Serializable interface
		                        2. add import java.io.Serializable;
		                        3. FileOutputstream fileOut = new FileOutputstream(file path)
		                        4. objectoutputstream out = new Objectoutputstream(fileOut);
		                        5. out.writeobject(objectName)
		                        6. out.close(); fileOut.close();
		 */              

		Usuario usuario = new Usuario();
		
		usuario.nome = "Davi";
		usuario.senha = "Clavi2908";
		
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\davis\\Documents\\a75Bro\\UsarioInfo.ser");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(usuario);
		out.close();
		fileOut.close();
		
		System.out.println("Informação do objeto salvo!");

	}

}
