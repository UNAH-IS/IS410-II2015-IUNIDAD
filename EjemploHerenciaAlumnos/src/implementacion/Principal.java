package implementacion;

import clases.Alumno;
import clases.Persona;

public class Principal extends Object{
	public Principal(){
		Alumno a = new Alumno("Juan","Perez","M",
						45,"1998","Sistemas");
		Persona p = new Persona();
		
		System.out.println(a.toString());
	}
	
	public static void main(String args[]){
		new Principal();
	}
}
