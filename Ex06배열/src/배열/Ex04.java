package 배열;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//1.크기가 5인 배열 생성, 래퍼런스 변수 선언
		int arr[] = new int[5];		
		
		int max; //최고점수
		int min; //최저점수
		int sum=0; //총합
		
		//2. 입력한 값을 배열에 저장
		for(int i=0;i<arr.length;i++) {
			System.out.print((i+1) +"번째 입력 >> ");
			arr[i] = sc.nextInt();
		}
		
		max=arr[0]; //최고점수
		min=arr[0]; //최저점수
		
		//3. 배열안에 모든 값 출력
		System.out.print("입력된 점수 : " );
		
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+ " ");
		
		//총합
		sum+=arr[i];
		
		//최고점수
		if(arr[i]>max) {
			max = arr[i];
		}
		//최저점수
		if(arr[i]<min) {
			min=arr[i];
		}
		}
		System.out.println("\n최고 점수 : "+ max);
		System.out.println("최저 점수 : "+ min);
		System.out.println("총 합 : "+ sum);
		System.out.println("평균 : "+ ((double)sum/arr.length));
		}
	}

