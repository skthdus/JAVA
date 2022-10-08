package 반복문;

import java.util.Scanner;

public class Ex07_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n입력 : ");
		int n = sc.nextInt();
		
		
		int num = 1;
		
		for(int i =1; i<=n; i++) {
			System.out.print(num + " ");
			num+=i;
		}
		
		/*
		 * int num = 1; 
		 * System.out.print(num); //1 
		 * num+=1; 
		 * System.out.print(num);//2 
		 * num+=2; 
		 * System.out.print(num); 
		 * num+=3; 
		 * System.out.print(num);
		 */

	}

}
