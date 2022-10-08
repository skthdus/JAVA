package 단순if문;

import java.util.Scanner;

public class EX04ifelse문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소프트웨어 설계 : ");
		int sub1 = sc.nextInt();
		
		System.out.print("소프트웨어 개발 : ");
		int sub2 = sc.nextInt();
		
		System.out.print("데이터베이스 구축 입력 : ");
		int sub3 = sc.nextInt();
		
		System.out.print("프로그래밍 언어 활용 : ");
		int sub4 = sc.nextInt();
		
		System.out.print("정보시스템 구축 관리 : ");
		int sub5 = sc.nextInt();
		
		int sum = sub1+sub2+sub3+sub4+sub5 ;
				
		if(sub1>=8&&sub2>=8&&sub3>=8&&sub4>=8&&sub5>=8 && sum>=60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}


		/*if (sub1<8 || sub2<8 || sub3<8 || sub4<8 || sub5<8) {
		System.out.println("불합격입니다");
	} else { if(sum>=60) {
		System.out.println("합격입니다");
	} else {
		System.out.println("불합격입니다");
	}
		*/

	}

}
