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
//		for (int i= 0; i<words.length; i++) {
//			System.out.print(words[i]);
//			System.out.print(" = ");
//			isPalindrome(words[i]);
//		}
		
		//printPalindromes(words);
		//reverseWord(words[0]);
		reverseWords(words);
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
	static boolean isPalindrome(char[] word) { 	
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
		return str1.equals(str2);
	}

	static void printPalindromes(char [][] words) {
		for (int i=0; i<words.length; i++) {
		if (isPalindrome(words[i])) {
			System.out.println(words[i]);
			}
		}
	}
	static void reverseWord(char[] word) {
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
		String str1 = String.valueOf(reverse);
		printWord(reverse);
	}
	static void reverseWords(char[][] list) {
		for (int i=0; i<list.length; i++) {
			reverseWord(list[i]);
			System.out.println();
			}
	}
}
