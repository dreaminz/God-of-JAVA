package chapter6;

public class InterestManager {
	public static void main(String args[]){
		InterestManager manager = new InterestManager();
		int i;
		for(i=0;i<=365;i++){
			System.out.println(calculateAmount(i,100));
			i+=10;
		}
		
		
	}
		public static double getInterestRate(int day){ //������ �󸶳� �Ǵ���
			if(day>0&&day<=90){
				return 0.005;
				//0.5%����
			}
			else if(day<=180){
				return 0.01;
				//1% ����
			}
			else if(day<=364){
				return 0.02;
				//2% ����
			}
			else if(day>=365){
				return 0.056;
				//5.6% ����
			}
			else{
				System.out.println("��¥�� �߸� �ԷµǾ����ϴ�");
				return 0;
				
			}
			
			}
		public static double calculateAmount(int day, long amount){
			double val= getInterestRate(day);
			return amount+(amount*val);
			//��ġ��+���� ����
		}
	

}
