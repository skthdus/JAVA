package 배열;

import java.util.Random;

public class Ex03 {

	public static void main(String[] args) {

		Random rd = new Random();

		//랜덤 배열 생성
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(20) + 1;
			System.out.println(arr[i]+" ");
		}
		
		//최대값
		//int max = 1;
		int max = arr[0];
		//최소값
		//int min = 20; //>1~20
		int min = arr[0];
		
		
		for (int i = 0; i < arr.length; i++) {
			
			//최댓값 구하는 반복문
			if (arr[i] > max) {
				max = arr[i];
			}
		
			//최솟값 구하는 반복문
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
		
		}

	}

