package clases;

import interfaces.Humano;

public class Abogado extends Persona implements Humano{
	public Abogado(String nombre, String apellido) {
		super(nombre, apellido);
	}

	@Override
	public void caminar() {
		System.out.println("Abogado caminando");	
	}

	@Override
	public void dormir() {
		System.out.println("Abogado durmiendo");		
	}

	@Override
	public void metodoX() {
				
	}

	@Override
	public void reproducir() {
		
	}

}
