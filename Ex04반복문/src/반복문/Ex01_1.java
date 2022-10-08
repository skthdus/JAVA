package 반복문;

import java.util.Scanner;

public class Ex01_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("일한 시간 입력 : ");
		int wh =sc.nextInt();
		
		//8시간보다 같거나 적은 시간동안 일하면 -> 5000원
		// 8시간보다 더 많이 일한경우 
		// -> ~8 : 5000원 + 초과 시간은 : 5000*1.5
		if(wh<=8) {
			System.out.println(wh*5000 + "원");
		} else {
			System.out.println(5000*8+(int)((wh-8)*(5000*1.5)) + "원");
		}
		
		int pay =0; //임금 저장 변수
		if(wh<=8) {
			pay = wh*5000;
		} else {
			pay = 5000*8 +(int)((wh-8)*(5000*1.5));
		}
		System.out.println("총 임금은 " + pay + "원 입니다");
	}

}
