package habitants;

// Question 9
public class SetHabitants {
	
	private int nbHab;
	private Habitant[] habitants;
	
	public SetHabitants () {
			this.habitants = new Habitant[100];
			this.nbHab = 0;
			
		}
	// Question 10
	public int trouverVoisinProche(Habitant h) {
		int min = 0;
		int indice = 0; 
		for (int i=0; i<nbHab; i++) {
			if (habitants[i].distance(h) < min) {
				min = (int)habitants[i].distance(h);
				indice = i; 
			}			
		}
		return indice;
	
	}
	// Question 11
	public void add(Habitant h) {
		//trouverVoisinProche(Habitant h); 
	}
}
