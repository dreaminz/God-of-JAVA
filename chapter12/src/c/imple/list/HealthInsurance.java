package c.imple.list;

public enum HealthInsurance {	

	LEVEL_ONE(1000, 1.0),
	LEVEL_TWO(2000, 2.0),
	LEVEL_THREE(3000, 3.2),
	LEVEL_FOUR(4000, 4.5),
	LEVEL_FIVE(5000, 5.6),
	LEVEL_SIX(6000, 7.1);
	
	double ratio;
	int maxSalary;
	
	HealthInsurance(int maxSalary, double ratio){
		this.maxSalary = maxSalary;
		this.ratio = ratio;
		
	}
	public double getRatio(){
		return ratio;
		
	}
	public static HealthInsurance getHealthInsurance(int salary){ //enum 타입은 "enum 클래스이름.상수이름"을 지정함으로써 클래스의 객채 생성완료
		if(salary>5000)
			return HealthInsurance.LEVEL_SIX;
		else if(salary>4000 && salary<=5000)
			return HealthInsurance.LEVEL_FIVE;
		else if(salary>3000 && salary<=4000)
			return HealthInsurance.LEVEL_FOUR;
		else if(salary>2000 && salary<=3000)
			return HealthInsurance.LEVEL_THREE;
		else if(salary>1000 && salary<=2000)
			return HealthInsurance.LEVEL_TWO;
		else if(salary<=1000)
			return HealthInsurance.LEVEL_ONE;
		else
			return null;
	}
	public static void main(String args[]){
		int salaryArray[] = new int[]{1500,5500,8000};
		HealthInsurance[] insurance = new HealthInsurance[3];
		insurance[0] = HealthInsurance.getHealthInsurance(salaryArray[0]);
		insurance[1] = HealthInsurance.getHealthInsurance(salaryArray[1]);
		insurance[2] = HealthInsurance.getHealthInsurance(salaryArray[2]);
		
		for(int loop=0; loop<3; loop++){
			System.out.println(salaryArray[loop]+"="+insurance[loop]+","+insurance[loop].getRatio());
		}
	}
}
