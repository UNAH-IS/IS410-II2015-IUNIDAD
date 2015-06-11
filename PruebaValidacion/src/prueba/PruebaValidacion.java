package prueba;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PruebaValidacion {
	public PruebaValidacion(){ 
		Pattern pattern = Pattern.compile("[0-1][0-5][0-9]|[0-9][0-9]|[1-9]");
		Matcher matcher = pattern.matcher("1");
		System.out.println("Resultado: "+matcher.matches());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		sdf.setLenient(false);
		try {
			Date fecha = sdf.parse("10-12-9999 22:59:59");
			System.out.println(fecha);
		} catch (ParseException e) { 
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new PruebaValidacion();

	}

}
