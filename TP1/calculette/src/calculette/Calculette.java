package calculette;

public class Calculette {
	  public static void main(String[] args){
		    int[] tab = new int[args.length];
		    int sum = 0 ;
		    
/*		    for (int c=0; c<tab.length; c++) {
		    	System.out.println(tab[c]);
		    }
*/		  
		    for (int i=0; i<args.length; i++){
		      System.out.println("Args["+i+"] : " + args[i]);
		      tab[i] = Integer.parseInt(args[i]);
		      sum += tab[i] ;
		    }
		  System.out.println("Somme des arguments : " + sum);
		  }
}
