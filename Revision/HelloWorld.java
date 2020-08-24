class HelloWorld {
    static final int num = 10;
    static double test = 10.12;
   
    public static void main (String[] args) {
        System.out.println("Hello World !!!");
        System.out.println(num);
        myfunction();
    }

    public static void myfunction(){
        int recast = (int)test;
        System.out.println(test);
        System.out.println(recast);

    }
    
}