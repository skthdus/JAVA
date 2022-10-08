package 다중for문;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int num = sc.nextInt();
		
		//약수 : 나누어 떨어지는 수
		for(int j =2 ; j<=30;j++) {
			System.out.print(j+"의 약수 : ");
		for(int i =1; i<=j/2 ; i++) {
			if(j%i==0) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println(j);
		}
	}

}
