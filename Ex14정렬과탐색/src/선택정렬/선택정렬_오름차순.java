package 선택정렬;

import java.util.Arrays;

public class 선택정렬_오름차순 {

	public static void main(String[] args) {
		
		int[] arr = {98, 7, 70, 13, 24};
		
		System.out.println("정렬 전 : "+ Arrays.toString(arr));
		
		//3번 인덱스에 들어갈 숫자만 찾으면 4번 인덱스는 이미 확정이 되어있음!
		for(int i=0; i<arr.length-1; i++) {
			//현재 가장 작은 숫자의 위치 기억
			//1회차 -0, 2회차 -1, 3회차 -2
			int index = i;
			for(int j=i+1; j<arr.length; j++) { //index번호 - index번호 바로 뒷자리 부터 비교 시작 ~ 배열의 끝
				//인덱스 번호가 바뀔 조건
				if(arr[index] > arr[j]) { //지금까지 본 배열의 값 중 가장 작은 값의 위치를 저장
//					현재 index가 가리키고 있는 자리에 저장된 값 > 비교되고 있는 자리의 숫자
					index = j; //>index가 비교되고 있는 자리를 가리키게
				}	
			} //배열내에서 n번째 가장 작은 값의 위치 저장
			
			//찾은 값이 원하는 위치에 저장될 수 있게하는 코드
			//제일 작은 값 -> 0, 두번째로 작은 값 ->1
			
			if(i != index) { //원래 숫자의 자리와 제일 작은 숫자가 저장된 자리가 다를때만
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
			System.out.println(i+1 + "회차 : "+ Arrays.toString(arr));
		}

	}

}
