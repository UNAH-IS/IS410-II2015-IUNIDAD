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
		 * 1 Agregar Libro
		 * 2 Modificar Libro
		 * 3 Eliminar Libro
		 * 4 Mostrar informacion
		 * 0 Salir
		 * */
		int opcion = 0;
		do{
			opcion = Integer.valueOf(JOptionPane.showInputDialog(
					"1 Agregar Libro\n"+
					"2 Modificar Libro\n"+
					"3 Eliminar Libro\n"+
					"4 Mostrar informacion\n"+
					"0 Salir"));
			
			switch (opcion){
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
							"Gracias por utilizar nuestro super sistema");
					break;
				default:
					break;
			}
		}while(opcion!=0);
		
	}
	
	public void agregarLibro(){
		//Crear una instancia de libro 
		//Solicitar informacion y asignar con los sets
		//Agregar instancia al ArrayList
		//Mostrar Informacion
		
		Libro libro = new Libro();
		
		/*libro.setTitulo(JOptionPane.showInputDialog("Titulo del libro:"));
		libro.setAutor(JOptionPane.showInputDialog("Autor:"));
		libro.setGenero(JOptionPane.showInputDialog("Genero:"));
		libro.setEditorial(JOptionPane.showInputDialog("Editorial:"));
		libro.setIsbn(JOptionPane.showInputDialog("ISBN:"));
		libro.setIdioma(JOptionPane.showInputDialog("Idioma:"));
		libro.setEdicion(Integer.valueOf(JOptionPane.showInputDialog("Edicion:")));
		libro.setAnio(Integer.valueOf(JOptionPane.showInputDialog("Año:")));
		libro.setCantidadPaginas(Integer.valueOf(JOptionPane.showInputDialog("Paginas:")));
		*/
		libro.solicitarInformacion(null);
		libros.add(libro);
		mostrarInformacion();
	}
	
	public void modificarLibro(){
		//Solicitar al usuario que indice modificar
		//Crear una instancia de libro
		//Solicitar informacion y asignar con los sets
		//Actualizar instancia en el ArrayList
		//Mostrar Informacion
		int indice = Integer.valueOf(JOptionPane.showInputDialog(null,
				"Que indice desea eliminar? (0 al "+(libros.size()-1)));
		Libro libro = new Libro();
		libro.solicitarInformacion(libros.get(indice));
		libros.set(indice,libro);
		mostrarInformacion();
	}
	
	public void eliminarLibro(){
		
	}
	
	public void mostrarInformacion(){
		System.out.println("Listado de libros");
		for(int i = 0; i<libros.size();i++){
			System.out.println(libros.get(i));
		}
	}
	
	public static void main(String[] args) {
		new Principal(); //Instanciando de forma anonima
	}
}
