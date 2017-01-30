package chapter8;


public class ManageStudent {

	public static void main(String args[]){
		Student[] student= null;
		
		ManageStudent ms = new ManageStudent();
		
		student = ms.addStudent();
		
		ms.printStudents(student);
		
		
		
		
		
		
	}
	public Student[] addStudent(){
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook","Seoul","01075229887","lingdoz@gmail.com");
		return student;
	}
	
	public void printStudents(Student[] student){
		int len = student.length;
		for(int i=0; i<len; i++){
			System.out.println(student[i]);
		}
	}
}
