package implementacion;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import clases.Persona;

public class Principal {
	private ArrayList<Persona> personas;
	public Principal(){
		personas = new ArrayList<Persona>();
		int opcion;
		do{
			opcion = Integer.valueOf(
					JOptionPane.showInputDialog(
							"1 Agregar registro\n"
							+ "2 Modificar registro\n"
							+ "3 Eliminar registro\n"
							+ "4 Mostrar informacion\n"
							+ "0 Salir."));
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
				case 4:
					mostrarInformacion();
					break;
				case 0:
					JOptionPane.showMessageDialog(null, "Adios");
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opcion invalida");
					break;
			}
		}while(opcion!=0);
	
	}
	
	public void agregarRegistro(){
		//Capturar informacion
		//Validar el dato
		//Si esta correcto: Almacenar en ArrayList
		//Si esta incorrecto: Solicitarlo nuevamente
		Persona p = new Persona();
		String errores = "";
		do{
			p.solicitarDatos(p);
			errores = p.validarCampos();
			if (!errores.isEmpty())
				JOptionPane.showMessageDialog(null,errores);
		}while(!errores.isEmpty());
	}
	
	public void modificarRegistro(){
		
	}
	
	public void eliminarRegistro(){
		
	}
	
	public void mostrarInformacion(){
		
	}
	
	public static void main(String[] args) {
		new Principal();
	}

}
