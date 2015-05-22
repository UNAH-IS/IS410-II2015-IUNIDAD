package clases;

public class Circulo{
	private int x;
	private int y;
	private int diametro;
	private String color;
	private final String COLOR_POR_DEFECTO = "Blanco";
	
	public static final int VALOR_ESTATICO = 1000;

	public Circulo(int x, 
			int y, 
			int diametro, 
			String color) {
		this.x = x;
		this.y = y;
		this.diametro = diametro;
		this.color = color;
	}
	
	public Circulo(){}

	public Circulo(int x, 
			int y, 
			int diametro) {
		this.x = x;
		this.y = y;
		this.diametro = diametro;
		this.color = COLOR_POR_DEFECTO;
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public int getX(){
		return x;
	}
	
	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getDiametro() {
		return diametro;
	}

	public void setDiametro(int diametro) {
		this.diametro = diametro;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double calcularArea(){
	     return Math.PI * Math.pow(diametro/2, 2);
	}
	
	public double calcularArea(int radio){
	     return Math.PI * Math.pow(radio, 2);
	}
	
	public double calcularArea(float radio){
	     return Math.PI * Math.pow(radio, 2);
	}
		
	void colorear(){}
	
	public String toString(){
		return "Circulo de color "+color + ", con diametro "+diametro;
	}
}
