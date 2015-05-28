package clases;

public class Alumno extends Persona{
	protected String cuenta;
	protected String carrera;

	public Alumno(String nombre, 
			String apellido, 
			String genero, 
			int edad,
			String cuenta, 
			String carrera) {
		super(nombre, apellido, genero, edad);
		this.cuenta = cuenta;
		this.carrera = carrera;
	}

	public void mostrarNombre(){
		System.out.println(nombre + "" + apellido);
	}
	
	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	public String toString(){
		return super.toString() + ", "+
				cuenta + ", " + carrera;
	}
}
