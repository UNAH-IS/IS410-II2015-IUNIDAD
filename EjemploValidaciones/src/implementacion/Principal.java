package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Persona;

public class Principal {
	private ArrayList<Persona> personas;
	public Principal(){
		personas = new ArrayList<Persona>();
		int opcion = 0;
		do{
			opcion = Integer.valueOf(
					JOptionPane.showInputDialog(
							"1 Agregar\n"
							+ "2 Modificar\n"
							+ "3 Eliminar\n"
							+ "0 Salir"));
			switch(opcion){
			case 1:
					agregarRegistro();
				break;
			case 2:
					modificarRegistro();
				break;
			case 3:
					eliminarRegistro();
				break;
			case 0:
					JOptionPane.showMessageDialog(null, "Adios");
				break;
			}
		} while(opcion!=0);
	}
	
	public void agregarRegistro(){
		//Ingrese un dato o los datos.
		//Validar datos.
		//Si es correcto: Agregar al ArrayList
		//Si no es correcto: Volver a ingresar la informacion
		Persona p = new Persona();
		String errores= "";
		do{
			p.solicitarDatos(p);
			errores= p.validarDatos();
			if(!errores.isEmpty())
				JOptionPane.showMessageDialog(null, errores);
		}while(!errores.isEmpty());
	}
	
	
	
	public void modificarRegistro(){
		
	}
	
	public void eliminarRegistro(){
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
