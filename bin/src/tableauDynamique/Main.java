package tableauDynamique;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne[] tes;
		TabDyn tests = new TabDyn(8) ; 
		Personne Paul = new Personne("Paul", 22); 
		Personne Arnaud = new Personne("Arnaud", 12);
		Personne Caroline = new Personne("Caroline", 17);
		Personne Marie = new Personne("Marie", 42);
		Personne Claire = new Personne("Claire", 25);
	
		tests.add(Paul);
		tests.add(Arnaud);
		tests.add(Caroline);
		tests.add(Marie);
		tests.add(Claire);
		
		tests.afficher();
	}

}
