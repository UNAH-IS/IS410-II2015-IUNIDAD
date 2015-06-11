package ejemplo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidarFecha {
	public ValidarFecha(){
		String fecha = "12/12/2015 12:59:30";
		SimpleDateFormat sdf = 
				new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setLenient(false);
		try {
			Date date = sdf.parse(fecha);
			System.out.println(date.toString());
		} catch (ParseException e) {
			System.out.println("Fecha invalida");
			//e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ValidarFecha();

	}

}
