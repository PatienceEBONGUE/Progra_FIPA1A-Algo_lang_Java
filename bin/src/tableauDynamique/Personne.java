package tableauDynamique;

// Question 7
public class Personne implements Comparable<Personne>{
	
	private String nom; 
	private int age; 
	
	public Personne(String nom, int age) {
		this.nom = nom;
		this.age = age;
	}

	public int compareTo(Personne o) {
		if (this.age > o.age) {
			return this.age ;
		}
		return o.age;
	}
	public String toString() {
		return this.nom+" a "+this.age+" ans"; 
	}

}

