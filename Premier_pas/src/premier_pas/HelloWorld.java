package premier_pas;
class HelloWorld {

  public static void main(String[] args) {
  /*System.out.println("Ah que coucou");*/
  System.out.println("Bonjour, monde !!!");
  for (int i=0; i<args.length; i++){
    System.out.println("Args["+i+"] :" + args[i]);
  }
  }
}
