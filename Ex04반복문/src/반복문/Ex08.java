package 반복문;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		int num = 0;
		int sum = 0;


		Scanner sc= new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		num = sc.nextInt();
		
		while(num!=0) {
			sum += num%10;
			num/=10;
		}
		System.out.println("합은 " + sum + "입니다.");
	}

}
