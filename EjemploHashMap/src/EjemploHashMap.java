import java.util.HashMap;


public class EjemploHashMap {
	private HashMap<String,String> valores;
	public EjemploHashMap(){
		valores = new HashMap<String,String>();
		valores.put("version","1.0b");
		valores.put("nombre","Super programa genial");
		
		System.out.println("Version: "+valores.get("version"));
	}
	public static void main(String[] args) {
		new EjemploHashMap();

	}

}
