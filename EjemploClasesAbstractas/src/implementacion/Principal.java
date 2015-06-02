package implementacion;

import java.util.ArrayList;

import clases.Cuadrado;
import clases.Figura;
import clases.Rectangulo;

public class Principal {
	private Figura f;
	//Definir colecciones que almacenen objetos 
	//de diferentes tipos siempre y cuando tengan
	//dependencia jerarquica
	private ArrayList<Figura> figuras;
	
	public Principal(){
		figuras = new ArrayList<Figura>();
		
		Rectangulo r1 = new Rectangulo(
				12,12,"Verde","Rectangulo",
				123,456);
		Cuadrado c1 = new Cuadrado(15,20,
				"Rosado","Cuadrado",100);
		Rectangulo r2 = new Rectangulo(
				12,12,"Amarillo","Rectangulo 2",
				123,456);
		Cuadrado c2 = new Cuadrado(15,20,
				"Verde Fluorescente","Cuadrado 2",100);
		Rectangulo r3 = new Rectangulo(
				12,12,"Anaranjado","Rectangulo 3",
				123,456);
		Cuadrado c3 = new Cuadrado(15,20,
				"Morado","Cuadrado 3",100);
		//Compatibilidad en una jerarquia de clases
		//Polimorfismo
		figuras.add(r1);
		figuras.add(c1);
		figuras.add(r2);
		figuras.add(c2);
		figuras.add(r3);		
		figuras.add(c3);
		
		/*r.dibujar();
		*c.dibujar();*/
		/*metodoX(r);
		metodoX(c);*/
		//mostrarRectangulos();
		//mostrarCuadrados();
		
		
		//Crear instancias de un objeto de una clase padre
		//utilizando el constructor de una clase hija
		f = new Rectangulo(
				20,122,"Amarillo",
				"Rectangulo a partir de una figura",
				600,400);
		
		//System.out.println(f.toString());
		
		//Padre = Hijo;
		//Cuadrado c = new Rectangulo(); //INVALIDO!!!!
		Rectangulo r5 = new Cuadrado();
		Figura f1 = new Cuadrado();
		
		Rectangulo r6 = new Rectangulo(20,122,"Amarillo",
				"Rectangulo",
				600,400);
		Cuadrado c4 = new Cuadrado(15,20,
				"Morado","Cuadrado 3",100);
		
		//Hacer un cast de un objeto de 
		//una clase hija a un objeto de una clase padre
		
		r6 = (Rectangulo)c4; //Cast de tipos, esta si es valida
		//c4 = (Cuadrado)r6; //INVALIDA
		
		System.out.println(r6.toString());
		System.out.println(c4.toString());
	}
	
	public void mostrarRectangulos(){
		System.out.println("----------Lista de rectangulos");
		for (int i=0; i<figuras.size(); i++){
			if(figuras.get(i) instanceof Rectangulo
				&& !(figuras.get(i) instanceof Cuadrado))
				//Se agrega el and ya que por herencia 
				//los Cuadrados tambien son instancias de 
				//la clase Rectangulo
				System.out.println(figuras.get(i).toString());
		}
	}
	
	public void mostrarCuadrados(){
		System.out.println("----------Lista de cuadrados");
		for (int i=0; i<figuras.size(); i++){
			if(figuras.get(i) instanceof Cuadrado)
				System.out.println(figuras.get(i).toString());
		}
	}
	public void metodoX(Figura figura){
		System.out.println(figura.getNombre());
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
