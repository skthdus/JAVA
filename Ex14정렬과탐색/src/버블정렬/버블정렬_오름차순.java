package 버블정렬;

import java.util.Arrays;

public class 버블정렬_오름차순 {

	public static void main(String[] args) {
		
		int[] arr = {10, 24, 7, 68, 42, 82, 3, 43};
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		
		} 
		System.out.println();
		
		for(int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println("\n정렬 전 : "+ Arrays.toString(arr));

		//버블정렬_오름차순
		//바깥쪽 반복문 : 배열의 크기-1 (크기 : 8 -> 반복문 : 7)
		for(int i=0; i<arr.length-1; i++) {
			//안쪽 반복문 : 0번 인덱스부터 인접요소 비교
			//j : 기준 (크기 :8인 배열, j:0~6(1회차) j:0~5(2회차))
			
			int cnt = 0; //n회차 안쪽 반복문 실행 시 값이 바뀌는 횟수를 카운팅
			//boolean sw =false; //n회차 안쪽 반복문 실행 시 값이 한번이라도 바뀌면 -> true
			for(int j=0; j<arr.length-1-i; j++ ) {
				//0-1 -> 1-2 -> 2-3 -> 3-4
				if(arr[j] > arr[j+1]) { 
					//j -> j=1 / j+1 -> j (치환) > 자리바뀜
					int temp = arr[j+1]; //둘 중 하나의 값을 임시적으로 저장
					arr[j+1] = arr[j];
					arr[j] = temp;
					cnt++; // >자리가 바뀌면 1증가
					//sw = true;
				}			
			}
			
			// 더 이상 바뀌는게 없으면 정렬을 수행(그 다음 안쪽 반복문 실행)하지 않도록
			if(cnt==0) { //if(!sw){ //sw가 false일 때 반복문 나가게!
									//false -> true, true -> false
				break; // >가장 가까운 반복문을 나감
			}
			
			System.out.println(i+1 +"번째 회 차 : " + Arrays.toString(arr));
		
			
		}
	}
}
