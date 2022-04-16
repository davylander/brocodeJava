package a75_serializer;

import java.io.Serializable;

import java.io.Serializable;

public class Usuario implements Serializable {
	
	String nome;
	String senha;
	
	public void digaOi() {
		System.out.println("Oi " + nome);
	}
	
}