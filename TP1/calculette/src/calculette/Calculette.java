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

// Autre solution réalisée pendant les révisions
/*class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World !!!");
		System.out.println("------- Exécution de la fonction---------");
		myfunction(args);
		System.out.println("------- Fin d'exécution---------");
	}

	public static void myfunction(String[] args) {
		int[] tab = new int[args.length];
		int i = 0;
		int res = 0;
		for (String num : args) {
			tab[i] = Integer.parseInt(num);
			res += tab[i];  
			i++;

		}
		System.out.println("res = " + res);

	}

}*/