package exercice_2;

import java.util.ArrayList;
import java.util.Random;

public class Tri {
	private ArrayList<Character> tab;
	
	public Tri() {
		this.tab = new ArrayList<Character> () ;
		// TODO Auto-generated constructor stub
	}
	
	public void add(int nb) {

		
		for (int i=0; i < nb; i++) {
			Random lettre = new Random();
			int let = lettre.nextInt(123); 
			if (let < 97) { let = 97 + (int) Math.random() ; } 
			tab.add((char)let); 
		}
		
		
	}
	public void afficher() {
		System.out.println(tab);		
	}
	
	public void trier() {
		ArrayList<Character> cop = new ArrayList<Character>(); 
		cop = (ArrayList<Character>) tab.clone(); 
		 
		char min = tab.get(0) ; 
		for( int i = 0; i<tab.size() - 1 ; i++) {
			//char min = tab.get(i);
			if (min > tab.get(i+1) ) {
				min = tab.get(i+1);			
				cop.set(i,  min);

			}
			cop.set(i, tab.get(i) );
			//System.out.println(i);
		}
		System.out.println(cop); 
		}
		

	public static void main(String[] args) {
		Tri n = new Tri(); 
		n.add(10); 
		n.afficher();
		n.trier();
		n.afficher();
		
		// TODO Auto-generated method stub

	}

}
