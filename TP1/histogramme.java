class Histogramme {
  public static void main(String[] args){
  int[] tab = { -1, -3, 2, -2, 3, 0, 4, 2, -2, -1 };
  int min = 0 ;
  int max = 0 ;
  for (int i = 0; i<tab.length; i++){
    System.out.print(tab[i]+", ");
    if ( tab[i] < min ) {
      min = tab[i] ;
    }
    else if (tab[i] > max) {
      max = tab[i];
    }
  }
  System.out.println(" ");
  System.out.println("la valeur minimum = "+ min);
  System.out.println("la valeur max = "+ max);
  for (int line = 0; line<tab.length; line++) {

    for (int col = 0; col<tab.length; col++) {
      if ( tab[col] > 0 ) {

        System.out.println("+");
      }
    }
  }
  System.out.println(" ");
 }
}
