package chapter3;

public class use {

	public static void main(String args[]){
		chapter3 calc = new chapter3();

		int a = 10;
		int b = 5;

		System.out.println("add result is .. "+calc.add(a,b));
		System.out.println("sub result is .. "+calc.substract(a,b));
		System.out.println("mul result is .. "+calc.mult(a,b));
		System.out.println("div result is .. "+calc.divide(a,b));

	}
}

