package interfaces;

public interface Humano extends SerVivo{
	public final static String GENERO_FEMENINO = "Femenino";
	public final static String GENERO_MASCULINO = "Masculino";
	
	public abstract void caminar();
	public abstract void dormir();
}