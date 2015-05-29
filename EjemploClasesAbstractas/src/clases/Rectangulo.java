package clases;

public class Rectangulo extends Figura{
	protected int ancho;
	protected int alto;
	
	public Rectangulo(int x, int y, 
			String color, String nombre, 
			int ancho,int alto) {
		super(x, y, color, nombre);
		this.ancho = ancho;
		this.alto = alto;
	}
	public Rectangulo(){}
	
	@Override
	public void dibujar() {
		System.out.println("Se dibuja un rectangulo");
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getAlto() {
		return alto;
	}
	public void setAlto(int alto) {
		this.alto = alto;
	}
	@Override
	public String toString() {
		return "Rectangulo [ancho=" + ancho + ", alto=" + alto + ", x=" + x
				+ ", y=" + y + ", color=" + color + ", nombre=" + nombre + "]";
	}
	
	
}
