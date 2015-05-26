package clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Libro {
	private String titulo;
	private Autor autor;
	//private ArrayList<Autor> autores; //En el caso de agregar varios autores
	private String genero;
	private String editorial;
	private String isbn;
	private String idioma;
	private int edicion;
	private int anio;	
	private int cantidadPaginas;
	public Libro(String titulo, 
			Autor autor, 
			String genero, 
			String editorial,
			String isbn, 
			String idioma, 
			int edicion,
			int anio,
			int cantidadPaginas) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.editorial = editorial;
		this.isbn = isbn;
		this.idioma = idioma;
		this.edicion = edicion;
		this.anio = anio;
		this.cantidadPaginas = cantidadPaginas;
	}
	
	public Libro(){
		autor = new Autor();
	} //Sobrecarga de constructor vacio
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public int getEdicion() {
		return edicion;
	}
	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public int getCantidadPaginas() {
		return cantidadPaginas;
	}
	public void setCantidadPaginas(int cantidadPaginas) {
		this.cantidadPaginas = cantidadPaginas;
	}
	@Override
	public String toString() {
		return titulo + "\t\t\t" + 
				autor.toString() + "\t\t\t"+ 
				genero + "\t\t\t" + 
				editorial + "\t\t\t" + 
				isbn+ "\t\t\t" + 
				idioma + "\t\t\t" + 
				edicion + "\t\t\t"+ 
				anio + "\t\t\t" + 
				cantidadPaginas;
	}
	
	/*public void solicitarInformacion(){
		titulo = JOptionPane.showInputDialog("Titulo del libro:");
		autor = JOptionPane.showInputDialog("Autor:");
		genero = JOptionPane.showInputDialog("Genero:");
		editorial = JOptionPane.showInputDialog("Editorial:");
		isbn = JOptionPane.showInputDialog("ISBN:");
		idioma = JOptionPane.showInputDialog("Idioma:");
		edicion = Integer.valueOf(JOptionPane.showInputDialog("Edicion:"));
		anio = Integer.valueOf(JOptionPane.showInputDialog("Año:"));
		cantidadPaginas = Integer.valueOf(JOptionPane.showInputDialog("Paginas:"));
	}*/
	public void solicitarInformacion(Libro libro){
		titulo = JOptionPane.showInputDialog("Titulo del libro:",libro.getTitulo());
		//autor = JOptionPane.showInputDialog("Autor:",libro.getAutor());
		autor.solicitarInformacion(libro.getAutor());
		genero = JOptionPane.showInputDialog("Genero:",libro.getGenero());
		editorial = JOptionPane.showInputDialog("Editorial:",libro.getEditorial());
		isbn = JOptionPane.showInputDialog("ISBN:",libro.getIsbn());
		idioma = JOptionPane.showInputDialog("Idioma:",libro.getIdioma());
		edicion = Integer.valueOf(JOptionPane.showInputDialog("Edicion:",libro.getEdicion()));
		anio = Integer.valueOf(JOptionPane.showInputDialog("Año:",libro.getAnio()));
		cantidadPaginas = Integer.valueOf(JOptionPane.showInputDialog("Paginas:",libro.getCantidadPaginas()));
	}
	
}