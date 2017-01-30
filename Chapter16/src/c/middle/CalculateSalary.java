package c.middle;

public class CalculateSalary {
	Employee [] employee = new Employee[5];
	
	public static void main(String args[]){
		CalculateSalary calculate = new CalculateSalary();
		calculate.calculateSalaries();
		
	}
	
	public long getSalaryIncrease(Employee employee){
		double rate= 0.0;
		switch(employee.getType()){
			case 1:
				rate=-0.95;
				break;
			case 2:
				rate=0.1;
				break;
			case 3:
				rate=0.2;
				break;
			case 4:
				rate=0.3;
				break;
			case 5:
				rate=1;
				break;
		}
		System.out.println("this is getsalary"+employee.getSalary()+"+"+"this is rate value"+(employee.getSalary()*rate));
		return (long)(employee.getSalary()+(employee.getSalary()*rate));
		
	}
	public void calculateSalaries(){
	
		employee[0] = new Employee("LeeDaeRi", 1, 1000000000l);
		employee[1] = new Employee("KimManager", 2, 100000000l);
		employee[2] = new Employee("WhangDesign", 3, 70000000l);
		employee[3] = new Employee("ParkArchi", 4, 80000000l);
		employee[4] = new Employee("LeeDevelop", 5, 60000000l);
		
		for(int i=0; i<employee.length;i++){
			System.out.println(employee[i].getName()+"="+getSalaryIncrease(employee[i]));
		}
		
	}
	

}
