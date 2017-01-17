package chapter5;

public class SalaryManager {
	
	public static void main(String args[])
	{
		SalaryManager manager = new SalaryManager();

		System.out.println("세금을 공제한 월소득 금액은 : "+manager.getMonthlySalary(20000000));
	}
	public double getMonthlySalary(int yearlySalary){
		
		double result=0;
		double monthlySalary = yearlySalary/12.0;
		result+=calculateTax(monthlySalary); // 소득세
		result+=calculatenationalpension(monthlySalary); // 연금
		result+=calculateHealthInsurance(monthlySalary); //건강 보험료
		result = monthlySalary-result;
		
		return result; //월급여 값
	}
	public double calculateTax(double monthlySalary){
		double tax = monthlySalary*0.125;
		System.out.println("떼이게 될 근로 소득세 금액 : "+tax);
		return tax;
	}
	public double calculatenationalpension(double monthlySalary){
		double nationalpension = monthlySalary*0.081;
		System.out.println("떼이게 될 연금 : "+nationalpension);
		return nationalpension;
	}
	public double calculateHealthInsurance(double monthlySalary){
		double Insurance = monthlySalary*0.135;
		System.out.println("떼이게 될 건강 보혐료 : "+Insurance);
		return Insurance;
	}
	
}

