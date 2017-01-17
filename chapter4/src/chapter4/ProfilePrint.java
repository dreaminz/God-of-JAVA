package chapter4;

public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;
	
	public static void main(String args[]){
		ProfilePrint profile = new ProfilePrint();
		
		profile.setAge((byte) 11);
		profile.setName("ÀÓµµÇö");
		profile.setMarried(false);
		
		
		profile.getAge();
		profile.getName();
		System.out.println(profile.isMarried());
		
	}
	
	public void setAge(byte ag){
		age = ag;
	}
	public void getAge(){
		System.out.println(age);
	}
	public void setName(String nam){
		name = nam;
		
	}
	public void getName(){
		System.out.println(name);
	}
	public void setMarried(boolean flag){
		isMarried = flag;
		
	}
	public boolean isMarried(){
		return isMarried;
	}
	

}
