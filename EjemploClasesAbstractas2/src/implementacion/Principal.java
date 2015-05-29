package implementacion;

import java.util.ArrayList;

import clases.Cuadrado;
import clases.Figura;
import clases.Rectangulo;

public class Principal {
	//Figura f;
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
		System.out.println("-----------------------");
		/*for (int i=0;i<figuras.size();i++){
			System.out.println(figuras.get(i).getClass());
			if (figuras.get(i).getClass().toString().equals("class clases.Rectangulo"))
				System.out.println("Es un rectangulo");
		}*/
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
