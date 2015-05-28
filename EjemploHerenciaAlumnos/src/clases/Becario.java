package clases;

public class Becario extends Alumno{
	private double beca;
	public Becario(String nombre, 
			String apellido, 
			String genero, 
			int edad,
			String cuenta, 
			String carrera,
			double beca){
		super(nombre,apellido,genero,edad,cuenta,carrera);
		this.beca = beca;
	}
	public void mostrarDatos(){
		System.out.println(getCuenta());
	}
}
