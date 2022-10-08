package 스위치;

import java.util.Scanner;

public class Ex02스위치2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(1~12) 입력 : ");
		int mon = sc.nextInt(); //1~12
		
		switch(mon) {
		case 3 : case 4 : case 5 :
			System.out.println(mon + "월은 봄입니다");
		break;
		case 6 : case 7 : case 8 :
			System.out.println(mon + "월은 여름입니다");
		break;
		case 9 : case 10 : case 11 :
			System.out.println(mon + "월은 가을입니다");
		break;
		case 12 : case 1 : case 2 :
			System.out.println(mon + "월은 겨울입니다");
		
	
		
		}
		



	}

}
