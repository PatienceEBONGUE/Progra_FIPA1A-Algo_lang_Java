// Question 1
package habitants;

public class Habitant {
	
	private String nom;
	private float x;
	private float y;

	// Question 2
	public Habitant (String nom, float x, float y) {
		this.nom = nom;
		this.x = x;
		this.y = y; 
		
	}
	
	// Question 3
	
	public String getNom () {
		return nom;
	}
	
	public float getX () {
		return x;
	}
	
	public float getY () {
		return y;
	}
	
	// Question 4
	public String toString() {		
		return nom+": ("+x+", "+y+")";
	}
	
	// Question 5
	public void afficher () {
		System.out.println(nom+": ("+x+","+y+")");
	}
	
	// Question 6
	
	public double distance(Habitant h) {	
		double dis= Math.sqrt((this.x-h.x)*(this.x-h.x) + (this.y-h.y)*(this.y-h.y));
		return dis;
	}
}

