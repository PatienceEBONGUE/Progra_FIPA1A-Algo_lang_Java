package exercice_1;

public class ErreurRacine extends Exception {
	String message;
	public ErreurRacine(String message)
	{
		this.message = message;
	}
}
