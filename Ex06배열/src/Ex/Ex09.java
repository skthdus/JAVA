package Ex;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		int[] arr = new int[10];
		int[] num = new int[10];
		
		for(int i=0; i<=4 ;i++) {
		System.out.print(i + "번째 별의 수 : ");	
		num[i]=sc.nextInt();
		
		arr[i]=num[i];
		
		}
		
		for(int i=0;i<=4;i++) {
			System.out.print(num[i]+ ":");
			for(int j=0;j<arr[i];j++) {
				System.out.print("*");
			}
			System.out.println();
		}


	}

}
