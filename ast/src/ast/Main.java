package ast;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scalar e1 = new Scalar(1); 
		Scalar e2 = new Scalar(6);
		Add sum = new Add(e1,e2) ;
		int res = sum.execute(); 
		
		System.out.println(sum);
		System.out.println(res);
		
	}
	
}


class Scalar {
	
	private int value;
	
	Scalar (int scalar) {
		this.value =  scalar; 
		}
	
	public int get () {
		return value; 
	}
	
	public String toString() {
		String conv = Integer.toString(value) ;
		return conv;
	}
}

class Add { 
	Scalar left; 
	Scalar right;  

	Add (Scalar left, Scalar right) {
		this.left = left; 
		this.right = right; 
	
	}
	
	
	public int execute() {
		int res = left.get() + right.get();  
		return (res); 
		}
	
	public String toString() {
		String e1 = Integer.toString(left.get());
		String e2 = Integer.toString(right.get());
		
		return ("+ "+e1+ " "+ e2);
				
	}
}
	

