package 연산자;

import java.util.Scanner;

public class Ex06삼항연산2 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하시오 : ");
		int ball = sc.nextInt();
	
		int result = ball/5;
		int result1 = (ball%5) ==0 ? result : result+1;
		
		// int box =(ball%5==0)?ball/5:ball/5+1
		
		
		System.out.println("필요한 상자의 수 : " + result1);
		// System.out.println("필요한 상자의 수 : " + ((ball%5) ==0 ? result : result+1));
	
		
	
			
	
	

	}

}
