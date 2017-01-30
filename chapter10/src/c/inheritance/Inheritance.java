
package c.inheritance;

public class Inheritance{
	public static void main(String args[]){
		Inheritance test = new Inheritance();
		test.objectCast2();
	}
	public void objectCast2(){
		Parent[] parrentArray = new Parent[3];
		parrentArray[0] = new Child();
		parrentArray[1] = new Parent();
		parrentArray[2] = new Child();


for(int i=0; i<parrentArray.length;i++){

	if(parrentArray[i] instanceof Child){
		Child tempChild = (Child)parrentArray[i];
		tempChild.printAge();
	}
	else if(parrentArray[i] instanceof Parent){
		System.out.println("Parent");
	}
}

	}
}



















