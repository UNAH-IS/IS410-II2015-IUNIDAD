package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Libro;
//Shift+Ctrl+O

public class Principal {
	private ArrayList<Libro> libros; //<> RawType - Receptaculo   
	public Principal(){
		libros = new ArrayList<Libro>();
		/*
		 * 1 Agregar libro
		 * 2 Modificar un libro
		 * 3 Eliminar un libro
		 * 4 Mostrar la informacion
		 * 0 Salir 
		 */
		
		int opcion =0;
		do{
			opcion = Integer.valueOf(JOptionPane.showInputDialog(
					"1 Agregar libro\n"
					+ "2 Modificar un libro\n"
					+ "3 Eliminar un libro\n"
					+ "4 Mostrar la informacion\n"
					+ "0 Salir"));
			switch(opcion){
			case 1:
				agregarLibro();
				break;
			case 2:
				modificarLibro();
				break;
			case 3:
				eliminarLibro();
				break;
			case 4:
				mostrarInformacion();
				break;
			case 0:
				JOptionPane.showMessageDialog(null,
						"Gracias por usar nuestro super sistema");
				break;
			default:
				JOptionPane.showMessageDialog(null,
						"Opcion Invalida");
				break;
			}
			
		}while(opcion!=0);
	}
	
	public void agregarLibro(){
		//crear una instancia de libro
		//setear los atributos obteniendo 
		// la informacion con JOptionPane
		//agregarlo al ArrayList
		//Mostrar la informacion
		Libro libro = new Libro();
		/*libro.setTitulo(JOptionPane.showInputDialog("Titulo:"));
		libro.setAutor(JOptionPane.showInputDialog("Autor:"));
		libro.setGenero(JOptionPane.showInputDialog("Genero:"));
		libro.setEditorial(JOptionPane.showInputDialog("Editorial:"));
		libro.setIsbn(JOptionPane.showInputDialog("ISBN:"));
		libro.setIdioma(JOptionPane.showInputDialog("Idioma:"));
		libro.setEdicion(Integer.valueOf(JOptionPane.showInputDialog("Edicion:")));
		libro.setAnio(Integer.valueOf(JOptionPane.showInputDialog("Año:")));
		libro.setCantidadPaginas(Integer.valueOf(JOptionPane.showInputDialog("Cantidad de paginas:")));*/
		libro.solicitarDatos(new Libro());
		libros.add(libro);
		mostrarInformacion();
	}
	
	public void modificarLibro(){
		//Solicitar el indice a modificar
		//Crear una nueva instancia
		//Solicitar los nuevos datos
		//Sustituir el objeto anterior por el nuevo
		//Mostrar informacion
		int indice = Integer.valueOf(JOptionPane.showInputDialog(
				"Que indice desea modificar? (0 - " + (libros.size()-1)));
		Libro libro = new Libro();
		libro.solicitarDatos(libros.get(indice));
		libros.set(indice,libro);
		mostrarInformacion();
	} 
	
	public void eliminarLibro(){
		
	}
	public void mostrarInformacion(){
		System.out.println("Libros registrados");
		for(int i = 0; i<libros.size();i++){
			System.out.println(libros.get(i));
		}
	}

	public static void main(String[] args) {
		new Principal(); //Instanciando de forma anonima
	}
}
