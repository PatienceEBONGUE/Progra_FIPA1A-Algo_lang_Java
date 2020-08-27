package palindrome;

public class Palindrome {
	
	public static void main (String[] args) {
		char[][] words = {{ 'a', 'n', 'i', 'm', 'a', 'l' },
		    { 'r', 'a', 'd', 'a', 'r' },
		    { 'r', 'e', 's', 'u', 'm', 'a' },
		    { 'r', 'e', 's', 's', 'a', 's', 's', 'e', 'r' },
		    { 'r', 'e', 'l', 'a', 'c', 'e', 'r' },
		    { 'k', 'a', 'y', 'a', 'k' },
		    { 'v', 'i', 'v', 'e', ' ', 'J', 'a', 'v', 'a', ' ', '!' }} ; 

//printWord(words[0]);
		//printWords(words);
		isPalindrome(words[1]);
		return;
	}
	
	static void printWord(char[] word) {
		for (int i=0; i<word.length; i++) {
			System.out.print(word[i]);
//			System.out.println();
		}
	}
	static void printWords(char[][] words) {
		for (int i=0; i<words.length; i++) {
			printWord(words[i]);
			System.out.println();
		}
	}
	static void isPalindrome(char[] word) { 	
		int c = 0; 
		char[] reverse = new char[word.length]; 
		for (int i=word.length - 1; i> -1; i--) {
			
			//System.out.println("i = " + i); 
			//System.out.println("c = " + c);
			reverse[c] = word[i]; 
//			System.out.println();
			c = c+1;
			//return reverse[c];
		}
		String str1 = String.valueOf(word);
		String str2 = String.valueOf(reverse);
		/*printWord(word);
		System.out.println();
		printWord(reverse);
		*/
		System.out.println(str1.equals(str2));
	}


}

// Autre solution réalisée pendant les révisions
/*	public static void main(String[] args) {
		char[][] words = { { 'a', 'n', 'i', 'm', 'a', 'l' }, { 'r', 'a', 'd', 'a', 'r' },
				{ 'r', 'e', 's', 'u', 'm', 'a' }, { 'r', 'e', 's', 's', 'a', 's', 's', 'e', 'r' },
				{ 'r', 'e', 'l', 'a', 'c', 'e', 'r' }, { 'k', 'a', 'y', 'a', 'k' },
				{ 'v', 'i', 'v', 'e', ' ', 'J', 'a', 'v', 'a', ' ', '!' } };

		System.out.println("Hello World !!!");
		System.out.println("------- Exécution de la fonction---------");
		// printWord(words[0]);
		// printWords(words);
		// System.out.println(isPalindrome(words[1]));
		// System.out.println(isPalindrome(words[0]));
		// System.out.println(isPalindrome(words[6]));
		// printPalindromes(words);
		// reverseWord(words[0]);
		reverseWords(words);
		System.out.println("\n------- Fin d'exécution---------");
	}

	static void printWord(char[] word) {
		for (char num : word) {
			System.out.print(num);
		}
		// System.out.print("\n");
	}

	static void printWords(char[][] words) {
		for (int i = 0; i < words.length; i++) {
			printWord(words[i]);
		}

	}

	static boolean isPalindrome(char[] word) {

		char[] myword = new char[word.length];
		boolean found = true;
		for (int i = word.length - 1; i > -1; i--) {
			myword[(word.length - 1) - i] += word[i];
			if (myword[(word.length - 1) - i] != word[(word.length - 1) - i]) {
				found = false;
			}
		}
		if (!found) {
			// System.out.print("The word ");
			// printWord(word);
			// System.out.print(" is not a Palyndrome\n");
			return false;
		} else {
			// System.out.print("The word ");
			// printWord(word);
			// System.out.print(" is a Palyndrome\n");
			return true;
		}
	}

	static void printPalindromes(char[][] words) {
		for (int i = 0; i < words.length; i++) {
			if (isPalindrome(words[i])) {
				printWord(words[i]);
				System.out.println("\r");
			}
		}

	}

	static void reverseWord(char[] word) {
		char[] myword = new char[word.length];
		for (int i = word.length - 1; i > -1; i--) {
			myword[(word.length - 1) - i] += word[i];
		}
		printWord(myword);

	}

	static void reverseWords(char[][] list){
        for (int i = 0; i < list.length; i++) {
            reverseWord(list[i]);
            System.out.println("\r");
        }
    }
*/