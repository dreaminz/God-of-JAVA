package chapter1_2;

public class chapter1_2 {
	
	
	public int subtract(int num1, int num2){
		int result;
		if(num1>num2){
			result = num1-num2;
		}
		else{
			result = num2-num1;
		}
		return result;
		
	}

	public int multiply(int num1, int num2){
		int result=num1*num2;
		return result;
		
	}
	
	public int divide(int num1, int num2){
		int result = num1/num2;
		return result;
		
	}
}
