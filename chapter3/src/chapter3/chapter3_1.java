package chapter3;

public class chapter3_1 { // this class name is 'profile'
	String name;
	int age;
	
	public static void main(String args[]){
	chapter3_1 profile = new chapter3_1();
	
	profile.setName("Min");
	profile.setAge(20);
	
	profile.printName();
	profile.printAge();
	
		
	}
	
	public void setName(String str){
		name = str;
	
	}
	public void setAge(int val){
		age = val;
		
	}
	public void printName(){
		System.out.println(name);
	}
	public void printAge(){
		System.out.println(age);
	}
	
}
