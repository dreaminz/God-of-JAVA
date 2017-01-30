package chapter7;

public class Array {
	public static void main(String args[]){
		Array ar = new Array();
		
		ar.referenceTypes();
		
	}
	public void referenceTypes(){
		String [] strings = new String[2];
		Array [] array = new Array[2];
		
		strings[0] = "hello guys";
		array[0] = new Array();
		System.out.println("Strings[0] = "+strings[0]);
		System.out.println("Array[0]=" +array[0]);
		
	}

}
