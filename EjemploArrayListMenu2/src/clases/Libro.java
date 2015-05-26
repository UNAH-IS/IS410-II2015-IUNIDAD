package clases;

import javax.swing.JOptionPane;

public class Libro {
	private String titulo;
	private String autor;
	private String genero;
	private String editorial;
	private String isbn;
	private String idioma;
	private int edicion;
	private int anio;	
	private int cantidadPaginas;
	public Libro(String titulo, 
			String autor, 
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
	
	public Libro(){}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
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
				autor + "\t\t\t"+ 
				genero + "\t\t\t" + 
				editorial + "\t\t\t" + 
				isbn+ "\t\t\t" + 
				idioma + "\t\t\t" + 
				edicion + "\t\t\t"+ 
				anio + "\t\t\t" + 
				cantidadPaginas;
	}
	
	public void solicitarDatos(Libro libroAnterior){
		titulo = JOptionPane.showInputDialog("Titulo:",libroAnterior.getTitulo());
		autor = JOptionPane.showInputDialog("Autor:",libroAnterior.getAutor());
		genero = JOptionPane.showInputDialog("Genero:",libroAnterior.getGenero());
		editorial = JOptionPane.showInputDialog("Editorial:",libroAnterior.getEditorial());
		isbn = JOptionPane.showInputDialog("ISBN:",libroAnterior.getIsbn());
		idioma = JOptionPane.showInputDialog("Idioma:",libroAnterior.getIdioma());
		edicion = Integer.valueOf(JOptionPane.showInputDialog("Edicion:",libroAnterior.getEdicion()));
		anio = Integer.valueOf(JOptionPane.showInputDialog("Año:",libroAnterior.getAnio()));
		cantidadPaginas = Integer.valueOf(JOptionPane.showInputDialog("Cantidad de paginas:",libroAnterior.getCantidadPaginas()));
	}
}