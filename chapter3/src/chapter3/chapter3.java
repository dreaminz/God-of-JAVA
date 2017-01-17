package chapter3;

public class chapter3 {

	public static void main(String args[]){
		

		int a = 10;
		int b = 5;

		System.out.println("add result is .. "+add(a,b));
		System.out.println("sub result is .. "+substract(a,b));
		System.out.println("mul result is .. "+mult(a,b));
		System.out.println("div result is .. "+divide(a,b));

	}
	
	public static int add (int a, int b){
		return a+b;
	}
	public static int substract (int a, int b){
		if(a>b){
			return a-b;
		}
		else{
			return b-a;
		}
		
	}
	public static int mult (int a, int b){
		return a*b;
		
	}
	public static float divide (int a, int b){
		return a/b;
	}

}
