package a75_deserializer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		// SÓ FUNCIONA EM PROJETOS DIFERENTES
		
		/*
		 * Important notes
		 * 1. Children classes of a parent class that implements Serializable will do so as well
		 * 2. Static fields are not serialized (they belong to the class, not an individual object)
		 * 3. the class's definition ("class file") is not recorded, cast it as the object type
		 * 4. Fields declared as "transient" aren't serialized, they're ignored
		 * 5. serialVersionUID is a unique version ID  
		 */
		
		/*
			Steps to Deserialize
			--------------------------------------------------------------
			1. Declare your object (don't instantiate)
			2. Your class should implement Serializable interface
			3. add import java.io.Serializable;
			4. FileInputstream fileIn = new FileInputstream(file path);
			5. ObjectInputstream in = new ObjectInputstream(fileIn);
			6. objectNam = (Class) in.readobject();
			7. in.close(); 
			8. fileIn.close();
			--------------------------------------------------------------
		*/
		
		Usuario usuario = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\davis\\Documents\\a75Bro\\UsarioInfo.ser");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		usuario = (Usuario) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(usuario.nome);
		System.out.println(usuario.senha);
		usuario.digaOi();
	}

}
