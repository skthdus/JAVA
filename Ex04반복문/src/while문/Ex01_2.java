package while문;

import java.util.Scanner;

public class Ex01_2 {

	public static void main(String[] args) {
		
		//while문
		Scanner sc = new Scanner(System.in);
		
		int num = 0; //사용자가 입력한 값을 저장    > 초기화시킴
		
		while(num<10) {  //반복 할 조건
			num = sc.nextInt();
		}
		
		
	}

}
