package 연산자;

import java.util.Scanner;

public class Ex04산술연산4 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		
		System.out.print("초 입력: ");
		int input = scan.nextInt();
		
		//1시 2분 3초;
		//시
		int hour = input / 3600;
		//분
		int min = input % 3600 / 60;
		//초
		int sec = input % 60;
		
		System.out.println(hour + "시 " + min + "분 " + sec + "초");
		
	
	
		// int second = scan.nextInt();
		// System.out.println(second/3600 + "시" + (second%3600)/60 + "분 " + second%60 + "초");
		
		
	
		
	}

}
