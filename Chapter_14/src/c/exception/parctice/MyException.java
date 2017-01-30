package c.exception.parctice;

public class MyException extends Exception {
	public MyException(){
		super();
	}
	public MyException(String msg){
		System.out.println("Second value can't be zero");
	}

}
