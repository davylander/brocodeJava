package a75_deserializer;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	String nome;
	String senha;
	
	public void digaOi() {
		System.out.println("Oi " + nome);
	}
	
}
