package chapter5;

public class SalaryManager {
	
	public static void main(String args[])
	{
		SalaryManager manager = new SalaryManager();

		System.out.println("������ ������ ���ҵ� �ݾ��� : "+manager.getMonthlySalary(20000000));
	}
	public double getMonthlySalary(int yearlySalary){
		
		double result=0;
		double monthlySalary = yearlySalary/12.0;
		result+=calculateTax(monthlySalary); // �ҵ漼
		result+=calculatenationalpension(monthlySalary); // ����
		result+=calculateHealthInsurance(monthlySalary); //�ǰ� �����
		result = monthlySalary-result;
		
		return result; //���޿� ��
	}
	public double calculateTax(double monthlySalary){
		double tax = monthlySalary*0.125;
		System.out.println("���̰� �� �ٷ� �ҵ漼 �ݾ� : "+tax);
		return tax;
	}
	public double calculatenationalpension(double monthlySalary){
		double nationalpension = monthlySalary*0.081;
		System.out.println("���̰� �� ���� : "+nationalpension);
		return nationalpension;
	}
	public double calculateHealthInsurance(double monthlySalary){
		double Insurance = monthlySalary*0.135;
		System.out.println("���̰� �� �ǰ� ������ : "+Insurance);
		return Insurance;
	}
	
}

