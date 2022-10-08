package Ex;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int [10];
		int[] arr = new int [10];

		for(int i=0; i<10; i++) {
			System.out.print((i+1) + "번 째 정수 입력>>");	
			num[i] = sc.nextInt();
			
			}
		
		System.out.print("3의 배수 : ");
		
		for (int i=1; i<10; i++) {
			if(num[i]%3==0) {
				arr[i]=num[i];
				System.out.print(arr[i] + " ");
			}
		
		}
		
			 }
		
		}

	


