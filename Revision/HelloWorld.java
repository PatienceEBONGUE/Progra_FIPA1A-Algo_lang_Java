class HelloWorld {
    static final int num = 10;
    static double test = 10.12;

    public static void main(String[] args) {
        char[][] words = { { 'a', 'n', 'i', 'm', 'a', 'l' }, { 'r', 'a', 'd', 'a', 'r' },
                { 'r', 'e', 's', 'u', 'm', 'a' }, { 'r', 'e', 's', 's', 'a', 's', 's', 'e', 'r' },
                { 'r', 'e', 'l', 'a', 'c', 'e', 'r' }, { 'k', 'a', 'y', 'a', 'k' },
                { 'v', 'i', 'v', 'e', ' ', 'J', 'a', 'v', 'a', ' ', '!' } } ;  
    
    
        System.out.println("Hello World !!!");
        System.out.println("------- Exécution de la fonction---------");
        // printWord(words[0]);
        // printWords(words);
        isPalindrome(words[1]);
        isPalindrome(words[0]);
        isPalindrome(words[2]);
        isPalindrome(words[3]);
        isPalindrome(words[4]);
        System.out.println("\n------- Fin d'exécution---------");
    }

    static void printWord(char[] word) {
        for (char num : word) {
            System.out.print(num);
        }
        // System.out.print("\n");
    }

    static void printWords(char[][] words) {
        for (int i=0; i<words.length; i++) {
                printWord(words[i]);
        }
        
    }

    static void isPalindrome(char[] word) {
        
        char[] myword = new char[word.length];
        boolean found = true; 
        for(int i=word.length-1; i>-1; i--) {
            myword[(word.length-1)-i]+=word[i];
        }
        for (int i = 0; i< word.length; i++) {
            if (myword[i] != word[i]) {
                found = false;
            }
        }
        // printWord(myword);
        if (!found) {
            System.out.print("The word "); 
            printWord(word);
            System.out.print(" is not a Palyndrome\n");
        }
        else {
            System.out.print("The word ");
            printWord(word);
            System.out.print(" is a Palyndrome\n");
        }
    }

}