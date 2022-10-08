package 반복문;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		int fac = 1;
		
		for(int i = 1 ; i<=num ; i++) { // for(int i =num ;i>=1 ;i--)
			fac = fac *= i;
		}
		System.out.println("출력 : " +fac);
	}

}
