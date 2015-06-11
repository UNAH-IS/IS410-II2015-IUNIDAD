package clases;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class Persona {
	private String identidad;
	private String nombre;
	private String apellido;
	private int edad;
	private String genero;
	private String fechaNacimiento;
	
	private String errores = "";
	private String patronIdentidad = "[0-9]{4}-[0-9]{4}-[0-9]{5}";
	//El patron de la edad no funciona
	private String patronEdad = "[0-1][0-5][0-9]|[0-9][0-9]|[0-9]";//0 - 159 
	private String patronFecha = "dd/MM/yyyy";
	
	public Persona(String identidad, String nombre, String apellido, int edad,
			String genero, String fechaNacimiento) {
		this.identidad = identidad;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.genero = genero;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona(){}

	public String getIdentidad() {
		return identidad;
	}

	public void setIdentidad(String identidad) {
		this.identidad = identidad;
	}

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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [identidad=" + identidad + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", edad=" + edad + ", genero="
				+ genero + ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	public void solicitarDatos(Persona p){
		errores = "";
		identidad = JOptionPane.showInputDialog("Identidad:",p.getIdentidad());
		nombre = JOptionPane.showInputDialog("Nombre:",p.getNombre());
		apellido = JOptionPane.showInputDialog("Apellido:",p.getApellido());
		String strEdad = JOptionPane.showInputDialog("Edad:",p.getEdad()); 
		//Validacion con expresiones regulares
		if(!validarPatron(patronEdad, strEdad))
			errores += "El campo edad no es valido\n";
		
		//Validacion capturando la excepcion
		try {
			//edad = Integer.valueOf(strEdad.isEmpty()?"0":strEdad);
			edad = Integer.valueOf(strEdad);
		} catch(NumberFormatException e){
			errores += "El campo edad debe ser numerico\n"; 		
		}
		
		
		genero = JOptionPane.showInputDialog("Genero:",p.getGenero());
		fechaNacimiento = JOptionPane.showInputDialog("Fecha de nacimiento:",p.getFechaNacimiento());
	}
	
	public String validarCampos(){		
		if (identidad.isEmpty())
			errores += "El campo identidad esta vacio.\n";
		if (nombre.isEmpty())
			errores += "El campo nombre esta vacio.\n";
		if (apellido.isEmpty())
			errores += "El campo apellido esta vacio.\n";
		if (edad == 0)
			errores += "El campo edad esta vacio.\n";
		if (genero.isEmpty())
			errores += "El campo genero esta vacio.\n";
		if (fechaNacimiento.isEmpty())
			errores += "El campo Fecha de nacimiento esta vacio.\n";
		
		//Validar identidad
		/*String partes[] = identidad.split("-");
		if(partes.length!=3)
			errores += "La identidad debe tener el formato XXXX-XXXX-XXXXX";*/
		if(!validarPatron(patronIdentidad, identidad))
				errores += "La identidad debe tener el formato XXXX-XXXX-XXXXX";
	
		
		SimpleDateFormat sdf = 
				new SimpleDateFormat(patronFecha);
		sdf.setLenient(false);
		
		try {
			sdf.parse(fechaNacimiento);
		} catch (ParseException e) {
			errores += "El campo fecha no es valido (DD/MM/YYYY)\n";
		}
		
		/*Validacion con ER
		 * if(!validarPatron(patronFecha, fechaNacimiento))
			errores += "El campo fecha no es valido";*/
		
		return errores;
	}
	
	public boolean validarPatron(String patron, String texto){
		Pattern pattern = Pattern.compile(patron);
		Matcher matcher = pattern.matcher(texto);
		return matcher.matches();
	
	}
}
