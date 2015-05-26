package clases;

import javax.swing.JOptionPane;

public class Autor {
	private String nombre;
	private String nacionalidad;
	private int codigoRegistro;
	public Autor(String nombre, String nacionalidad, 
			int codigoRegistro) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.codigoRegistro = codigoRegistro;
	}
	public Autor(){}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getCodigoRegistro() {
		return codigoRegistro;
	}
	public void setCodigoRegistro(int codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}
	@Override
	public String toString() {
		return 	nombre + "\t\t\t" + 
				nacionalidad + "\t\t\t" +
				codigoRegistro;
	}
	public void solicitarInformacion(Autor autor){
		nombre = JOptionPane.showInputDialog(
				"Nombre del Autor",autor.getNombre());
		nacionalidad = JOptionPane.showInputDialog(
				"Nacionalidad del Autor",autor.getNacionalidad());
		codigoRegistro = Integer.valueOf(JOptionPane.showInputDialog(
				"Codigo de registro del Autor",autor.getCodigoRegistro()));
	}
}
