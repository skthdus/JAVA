package 단순if문;

import java.util.Scanner;

public class Ex05자판기 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("넣을 금액 : ");
		int money = sc.nextInt();
		
		
		System.out.print("--메뉴--");
		System.out.print("1.콜라(1800원) 2.파워에이드(2000원) 3.탄산수(1200원) >> ");
		
		int menu=sc.nextInt();
		
		int change=0;
		
		if(menu == 1 && money>=1800) {  //콜라
			System.out.println("잔돈 : " + (change = money-1800) + "원");
		} else if (menu==2 && money>=2000) {  //파워에이드
			System.out.println("잔돈 : " + (change = money-2000) + "원");
		} else if (menu==3 && money>=1200) {  //탄산수
			System.out.println("잔돈 : " + (change = money-1200) + "원");
		} else {  //1,2,3외 다른 숫자
			System.out.println("돈이 부족해요ㅠㅠ");
		}
			
		
		System.out.println("천원 : " + change/1000);
		System.out.println("오백원 : " + change%1000/500);
		System.out.println("백원 : " + change%1000%500/100);
		
	
	
	}

}
