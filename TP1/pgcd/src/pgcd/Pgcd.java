package pgcd;

public class Pgcd {
		  public static void main(String[] args){
			  
			if (args.length < 2) {
				System.out.println("Le nombre d'argument est inférieur à 2");
				System.exit(1);
			}
		    for (int i=0; i<args.length; i++){
		      System.out.println("Args["+i+"] :" + args[i]);

		    }
		    int p = Integer.parseInt(args[0]);
		    int q = Integer.parseInt(args[1]);
		    /*System.out.println(p);*/
		    /*System.out.println(q);*/

		    boolean w = true;

		    while(w) {
		      if ( p == 0 ) {
		        System.out.println("pgcd(p,q) = " +q);
		        w = false;
		      }
		      else if ( q == 0 ) {
		        System.out.println("pgcd(p,q) = " +p);
		        w = false;
		      }
		      else if ( p>q ) {
		        p = (int)(p-q);
		      }
		      else {
		        q = (int)(q-p);
		      }
		      
		    }
		  }
}

// Autre solution réalisée pendant les révisions
/*
 * public class Pgcd {
 * 
 * public static void main(String[] args) {
 * System.out.println("Hello World !!!");
 * System.out.println("------- Exécution de la fonction---------");
 * myfunction(args); System.out.println("------- Fin d'exécution---------"); }
 * 
 * public static void myfunction(String[] args) { if (args.length != 2) {
 * System.out.println("Veuillez renseignez deux arguments (chiffres)");
 * System.exit(3); }
 * 
 * int p = Integer.parseInt(args[0]); int q = Integer.parseInt(args[1]); int rep
 * = 0;
 * 
 * if (p == 0) { rep = q; System.out.println("pgcd(" + p + "," + q + ") = " +
 * rep); } else if (q == 0) { rep = p; System.out.println("pgcd(" + p + "," + q
 * + ") = " + rep); }
 * 
 * else { while (p > q || p < q) {
 * 
 * if (p > q) { p = p - q; rep = p; } else if (q > p) { q = q - p; rep = q; }
 * 
 * }
 * 
 * System.out.println("pgcd(" + args[0] + "," + args[1] + ") = " + rep);
 * 
 * }
 * 
 * }
 * 
 * }
 */