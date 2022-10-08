package 연산자;

import java.util.Scanner;

public class Ex03산술연산3 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.print("JAVA 점수 입력: ");
		int java = scan.nextInt();
		
		System.out.print("WEB 점수 입력 : ");
		int web = scan.nextInt();
		
		System.out.print("ANDROID 점수 입력 : ");
		int android = scan.nextInt();
		
		System.out.println("합계 : " + (java + web + android));
		System.out.printf("평균 : %.2f", ((double)java + web + android) /3);
		
		//합계 int total = java + web + android;
		//평균 double avg = total/3.0;
		
		//System.out.println("합계 :"+total);
		//System.out.println("평균 : "+avg);
		//System.out.printf("평균 : %.2f", avg);
		
		
		
		
	}

}
