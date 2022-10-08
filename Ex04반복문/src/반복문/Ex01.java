package 반복문;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("일한시간을 입력하세요 : ");
		int time = sc.nextInt();
		
		if(time<=8) {
			System.out.println("총 입금은 " + (time*5000) + "원 입니다.");
		} else {
			System.out.println("총 입금은 " + (time*5000*(int)1.5) + "원 입니다.");
		}
	}

}
