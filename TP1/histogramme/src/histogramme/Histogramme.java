package histogramme;

public class Histogramme {
	  public static void main(String[] args) {
	    int[] tab = { -1, -3, 2, -2, 3, 0, 4, 2, -2, -1, }; 

	    int min = 0;
	    int max = 0;
	    
	    for(int i=0; i<tab.length; i++) {
	      if(tab[i] < min)
	        min = tab[i];
	      if(tab[i] > max)
	        max = tab[i];
	    }
	    
	    for(int line=max; line>=min; line--) {
	      for(int col=0; col<tab.length; col++) {
	        char c;
	        if(line == 0)
	          c = '+';
	        else
	          c = ' ';
	        
	        if(tab[col] == 0 && line == 0 ||
	           tab[col] < 0 && line < 0 && line >= tab[col] ||
	           tab[col] > 0 && line > 0 && line <= tab[col])
	          c = '*';
	        System.out.print(c);
	      }
	      System.out.println();
	    }
	  }
	}