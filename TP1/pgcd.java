class Pgcd {
  public static void main(String[] args){
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
