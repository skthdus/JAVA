package 배열;

import java.util.Random;

public class Ex02 {

	public static void main(String[] args) {
		
		//random 도구(객체, 인스턴스)
		Random rd = new Random();
		
		int [] arr3 = new int[10];
		for(int i=0;i<arr3.length;i++) {
			arr3[i]=rd.nextInt(20)+1;
			System.out.println(arr3[i]+ " ");
		}
		
		//1. 크기가 10인 1차원 정수형 배열을 선언한 후 원하는 값으로 초기화하시오.

		int [] arr = new int[10]; //배열생성 -> 값 따로 초기화 X (0)
		
		arr[0]=5;
		arr[1]=6;
		arr[2]=13;
		arr[3]=27;
		arr[4]=36;
		arr[5]=35;
		arr[6]=78;
		arr[7]=2;
		arr[8]=3;
		arr[9]=1;
		
		
		int[] arr2= {5,6,13,27,36,35,78,2,3,1};
		// int[] arr2;
		// arr2 = {2,4,6,7,4,8,2,6,8,4}; 
		// -> 이렇게 쓰는 거 불가능! 무조건 배열 생성 후 바로 변수까지 선언
		
		int cnt = 0;
		for(int i=0;i<arr2.length;i++) {
			if(arr2[i]%2==1) {
				cnt++;
				System.out.println(arr[i]);
			}
			
		}
		System.out.println("홀수 개수 : "+ cnt);
	

	}

}
