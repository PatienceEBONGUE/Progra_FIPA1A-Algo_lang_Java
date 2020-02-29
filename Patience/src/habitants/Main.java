package habitants;
// Question 7
public class Main {
	public static void main(String[] args) {
		Habitant Nathan = new Habitant("Nathan",1, 2);
		Habitant Tamara = new Habitant("Tamara",-3, 5);
		Habitant Caroline = new Habitant("Nathan",1, 2);
//Question 8		
		System.out.println(Nathan.distance(Tamara));
		System.out.println(Tamara.distance(Caroline));
		System.out.println(Caroline.distance(Nathan));
		
	}

}