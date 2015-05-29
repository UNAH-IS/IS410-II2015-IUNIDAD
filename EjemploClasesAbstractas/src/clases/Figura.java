package clases;

public abstract class Figura {
	protected int x;
	protected int y;
	protected String color;
	protected String nombre;
	
	public Figura(int x, int y, String color, String nombre) {
		this.x = x;
		this.y = y;
		this.color = color;
		this.nombre = nombre;
	}
	public Figura(){}
	
	public abstract void dibujar();
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Figura [x=" + x + ", y=" + y + ", color=" + color + ", nombre="
				+ nombre + "]";
	}	
}
