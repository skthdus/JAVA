package while문;

import java.util.Scanner;

public class Ex01_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		while(true) {   //무한 반복
			num = sc.nextInt();
			
			if(num>=10) {  //반복을 멈출 조건
				//반복문 멈추는 키워드
				//break : 가장 가까운 반복문을 나감
				break;
			}
		} 
		

	}

}
