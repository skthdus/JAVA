package 반복문;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int n = 1;
		
		System.out.print("n 입력 : ");
		int num = sc.nextInt();
		
		for(int i =1; i<=num; i++) {
			sum =+ n;
			n = n + i;
			
			System.out.print(sum+ " ");
		}
	}

}
