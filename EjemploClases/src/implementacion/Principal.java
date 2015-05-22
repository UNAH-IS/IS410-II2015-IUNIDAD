package implementacion;

import clases.Circulo;

public class Principal {

	public static void main(String[] args) {
		/*Circulo c;	// Circulo es la clase
					// c es el objeto
		c = new Circulo(10,20,50);
		System.out.println("Area: " + c.calcularArea());*/
		int enteros[] = new int[3];
		Circulo circulos[] = new Circulo[3];
		circulos[0] = new Circulo();
		circulos[0].setDiametro(50);
		circulos = new Circulo[10];
		Circulo c = new Circulo(10,10,12,"Rojo");
		
		System.out.println(c);
	}
}
