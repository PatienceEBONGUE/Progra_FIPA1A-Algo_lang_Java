package tableauDynamique;

public class TabDyn<E> {

	private E[] tableau;  // un tableau d'éléments génériques E
	private int tailleInitiale; // un entier qui donne la taille initiale du tableau
	private int Taille ; // la taile actuelle du tableau
	private int nbElts ;// le nombre d'éléments dans le tableau 
	
	public TabDyn (int tailleInitiale) {
		this.tailleInitiale = tailleInitiale;
		this.tableau = (E[])new Object[this.tailleInitiale] ;
		this.Taille = tailleInitiale;
		this.nbElts = 0;
		
	}
	
	public void agrandir() {
		if(this.nbElts >= this.tableau.length) {
			E[] tmp = (E[])new Object[this.tableau.length * 2] ; 
			int i = 0;
			for (E e : tableau) {
				tmp[i] = e;
				i++;
			}
			
			this.tableau = (E[])new Object[this.tailleInitiale+this.Taille];
			this.tableau = tmp;
		}
	
	}
	public void ajuster() {
		if ( this.nbElts < this.Taille ) { 
			if ((this.Taille - this.nbElts) > this.tailleInitiale);
				E[] tmp = (E[])new Object[this.tableau.length * 2] ; 
				int i = 0;
				for (E e : tableau) {
					tmp[i] = e;
					i++;
				}
				this.Taille = this.tableau.length;
				this.tableau = (E[])new Object[this.Taille];
				this.tableau = tmp;
		}

	}
	public void add(E e) { 
		if (this.Taille == this.nbElts) {
			this.agrandir(); 
			this.tableau[this.nbElts+1] = e;
		}
		this.tableau[this.nbElts+1] = e;
		this.nbElts = this.nbElts + 1;
	}
	public void afficher () {
		System.out.println("Nombre d'elements = "+this.nbElts);
		for (E e : tableau) {
			System.out.print(e+", ");
		}
		
	}
	
	public E[] getTableau() {
		return tableau;
	}

//	public void setTableau(E[] tableau) {
//		this.tableau = tableau;
//	}

	public int getTaille() {
		return Taille;
	}

//	public void setTaille(int taille) {
//		Taille = taille;
//	}

	public int getNbElts() {
		return nbElts;
	}

//	public void setNbElts(int nbElts) {
//		this.nbElts = nbElts;
//	}


}
