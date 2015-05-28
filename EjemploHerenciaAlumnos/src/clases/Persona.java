package clases;

public class Persona {
	protected String nombre;
	protected String apellido;
	protected String genero;
	protected int edad;
	public Persona(String nombre, 
			String apellido, 
			String genero, 
			int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.edad = edad;
	}
	public Persona(){}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}	
	public String marcarAsistencia(){
		return "Marcar asistencia";
	}
	
	//Redefinir o sobreescribir un metodo:
	//volver a definir el contenido de un metodo 
	//de una clase padre en la clase hija
	//de tal forma que actue de forma diferente
	// Sobreescritura es una de las funcionalidades de
	// polimorfismo.
	// Polimorfismo: misma forma, actua diferente
	@Override
	public String toString() {
		return nombre + " " + apellido;
	}
}
