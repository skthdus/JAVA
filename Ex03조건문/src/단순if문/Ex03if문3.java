package 단순if문;

import java.util.Scanner;

public class Ex03if문3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력 : ");
		int java = sc.nextInt();
		
		System.out.print("Python 점수 입력 : ");
		int python = sc.nextInt();
		
		System.out.print("Android 점수 입력 : ");
		int android = sc.nextInt();
		
		//평균
		double avg = (java+python+android)/3.0;
		
		//int score = (java + python + android)/3;
		
		
		if(avg>80) { //평균이 80점보다 크니?
			// 평균이 80점보다 클 경우 (true)
			System.out.println("합격"); 
		} else {
			//평균이 80보다 같거나 작은 경우 (false)
			System.out.println("불합격");
		}
		
		


	}

}
