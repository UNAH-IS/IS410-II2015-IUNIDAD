package implementacion;

import java.util.ArrayList;

import clases.Cuadrado;
import clases.Figura;
import clases.Rectangulo;

public class Principal {
	private Figura f;
	/*
	 * Podemos definir una coleccion generica que almacene
	 * objetos de diferente tipo siempre y cuando sean del
	 * mismo padre.
	 */
	
	private ArrayList<Figura> figuras;
	 
	public Principal(){
		figuras = new ArrayList<Figura>();
		
		Rectangulo r1 = new Rectangulo(
				10,10,"Verde","Rectangulo 1",500,200);
		Rectangulo r2 = new Rectangulo(
				10,10,"Morado","Rectangulo 2",500,200);
		Rectangulo r3 = new Rectangulo(
				10,10,"Verde Fluorescente","Rectangulo 3",500,200);
		Cuadrado c1 = new Cuadrado(
				20,15,"Rosado","Cuadrado 1",100);
		Cuadrado c2 = new Cuadrado(
				20,15,"Cafe","Cuadrado 2",100);
		Cuadrado c3 = new Cuadrado(
				20,15,"Anaranjado","Cuadrado 3",100);
		
		figuras.add(r1);
		figuras.add(c3);
		figuras.add(r3);		
		figuras.add(c1);
		figuras.add(r2);
		figuras.add(c2);
		
		mostrarRectangulos();
		mostrarCuadrados();
		System.out.println("---------Pruebas de compatibilidad--------------");
		//Crear objetos a partir de constructores de clases hijas
		//
		f = new Rectangulo(10,10,"Amarillo",
				"Figura a partir de un rectangulo",500,200);
		f = new Cuadrado(
				20,15,"Azul","figura a partir de un Cuadrado",100);
		//ClasePadre o = new ClaseHija();
		//System.out.println(f.toString());
		
		
		Rectangulo r4 = new Rectangulo(
				10,10,"Azul dorado","Rectangulo 4 ",500,200);
		Cuadrado c4 = new Cuadrado(
				20,15,"Azul cielo","Cuadrado 4",100);
		
		//Hacer un cast o asignacion de un objeto
		//hijo a un objeto padre
		//PADRE = HIJO  VALIDO!
		r4 = (Rectangulo)c4;
		//HIJO = PADRE INVALIDO!!!
		//c4 = (Cuadrado)r4;
		System.out.println(r4.toString());
	}
	
	public void mostrarRectangulos(){
		System.out.println("--------Lista de Rectangulos--------");
		for(int i = 0;i<figuras.size();i++){
			if (figuras.get(i) instanceof Rectangulo
					&& !(figuras.get(i) instanceof Cuadrado))
				System.out.println(figuras.get(i).toString());
		}
	}
	public void mostrarCuadrados(){
		System.out.println("--------Lista de Cuadrados--------");
		for(int i = 0;i<figuras.size();i++){
			if (figuras.get(i) instanceof Cuadrado)
				System.out.println(figuras.get(i).toString());
		}
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
