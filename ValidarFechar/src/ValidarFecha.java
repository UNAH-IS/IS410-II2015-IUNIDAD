import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ValidarFecha {
	public ValidarFecha(){
		String fecha = "12/12/2015 13:59:39";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		sdf.setLenient(false); //Verifica una fecha real
		try {
			Date date = sdf.parse(fecha);
			System.out.println(date.toString());
		} catch (ParseException e) {
			System.out.println("FECHA INVALIDA");
			//e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		new ValidarFecha();

	}

}
