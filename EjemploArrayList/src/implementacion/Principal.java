package implementacion;

import java.util.ArrayList;

import clases.Libro;
//Shift+Ctrl+O

public class Principal {
	private ArrayList<Libro> libros; //<> RawType - Receptaculo   
	public Principal(){
		libros = new ArrayList<Libro>();
		
		
		Libro l2 = new Libro("Fundamentos de BD",
				"SilbersChatz","Programacion","Editorial Y",
				"NFJJ666","Español",
				12,2015,5000
				);		
		
		Libro l3 = new Libro("El alquimista",
				"Pablo Cohelo","Novela","Editorial Z",
				"GT565677","Español",
				3,1998,500
				);
		//Agregar una instancia de forma anonima
		libros.add(new Libro("Como Programar en Java",
				"Deitel","Programacion","Editorial X",
				"NFJ456564","Español",
				9,2007,6000000
				)); //0
		libros.add(l2); //1
		libros.add(l3); //2
		
		
		for(int i = 0; i<libros.size();i++){
			System.out.println(libros.get(i));
		}
	}

	public static void main(String[] args) {
		new Principal(); //Instanciando de forma anonima
	}
}
