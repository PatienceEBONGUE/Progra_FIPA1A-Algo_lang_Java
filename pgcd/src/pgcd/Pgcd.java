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

