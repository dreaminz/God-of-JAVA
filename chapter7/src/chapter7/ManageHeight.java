package chapter7;

public class ManageHeight {
	int gradeHeights[][];
	
	
	public static void main(String args[]){
		ManageHeight mh = new ManageHeight();
		mh.setData();
		
		int grade = mh.gradeHeights[0].length; //1반부터 5반까지 입력. 총 5개의 배열이므로 length로 대체
		
//		for(int classroom=1;classroom<=grade;classroom++){
//			mh.printHeight(classroom);	
//		}
		int classNo=1;
		while(classNo<=grade){
			System.out.println("Class No.:"+(classNo));
			mh.printAverage(classNo);
			classNo++;
		}
	}
	public void setData(){
		gradeHeights = new int[5][];
		gradeHeights[0] = new int[] { 170, 180, 173, 175, 177 };
		gradeHeights[1] = new int[] { 160, 165, 167, 186 };
		gradeHeights[2] = new int[] { 158, 177, 187, 176 };
		gradeHeights[3] = new int[] { 173, 182, 181 };
		gradeHeights[4] = new int[] { 170, 180, 165, 177, 172 };
		
	}
	public void printHeight(int classNo){
		int temp_classNo = classNo-1; //1반 입력시 0번째 배열 출력
		
		int len = gradeHeights[temp_classNo].length;
		System.out.println("Class no. : "+classNo);
		for(int i=0;i<len;i++){
			System.out.println(gradeHeights[classNo-1][i]);
		}
		
	}
	public void printAverage(int classNo){
		double sum=0.0;
		
		int len = gradeHeights[classNo-1].length;
		for(int n=0;n<len;n++){
			sum+=gradeHeights[classNo-1][n];
		}
		System.out.println("average is..."+(sum/len));
	}
	

}
