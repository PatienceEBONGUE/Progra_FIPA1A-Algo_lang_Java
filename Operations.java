package exercice_1;

public class Operations {
	
	public static String selectOperation(String[] tab){
		double nb = Math.random();
		if(nb> 0.5)
			return tab[0];
		return tab[1];
	}
	
	public static void division(double a, double d) throws ErreurDivision{
		if (d == 0) { throw new ErreurDivision("Erreur !!! Division par zéro non prise en charge"); }
		System.out.println("division : "+a/d);
		
	}
	
	public static void racine(double d) throws ErreurRacine{
		if (d < 0) { throw new ErreurRacine("Erreur !!! Racine de réel négatif non prise en charge");
		}
		System.out.println("racine : "+Math.sqrt(d));
	}
	
	public static void main(String[] args) {
		double[] tab = {-80, 12, 0, -7, 60, -9, 28, 0};
		String r = "racine";
		String d = "division";
		String[] op = {r, d};
		
		for (int i = 0; i < tab.length -1; i++) {
			if(selectOperation(op).compareTo(r) == 0)
				
				try {racine(tab[i]);}
				catch (ErreurRacine v) {
					System.out.println(tab[i] + " " + v.message);
				}
			else if(selectOperation(op).compareTo(d) == 0)
				
				try {division(tab[i], tab[i+1]);}
				catch (ErreurDivision t) {
					System.out.println(tab[i] + " " + t.message);
				}
			
		}
	}

}


