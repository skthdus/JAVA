package 배열;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		System.out.println("==채점하기==\n답을 입력하세요");
		Scanner sc=new Scanner(System.in);
		
		// 사용자가 입력한 답을 저장하는 배열
		int input[] = new int[5];
		// 실제 답을 저장하고 있는 배열
		int answer[]= {1,4,3,2,1};
		
		for(int i=0;i<input.length;i++) {
			System.out.print((i+1) +"번답 >> ");
			input[i] = sc.nextInt();
		}
		
		//input 배열에 있는 값 출력
		System.out.print("입력한 답은 : ");
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i]+ " ");
	}
		System.out.print("\n정답확인 : ");
		
		int sum =0; //총합을 저장할 변수
		//답을 비교하는 반복문
		for(int i=0; i<input.length; i++) {
			if(input[i]==answer[i]) {
				System.out.print("O ");
				sum++;
			}else {
				System.out.print("X ");
			}
		}
	
		System.out.print("총점 : "+ (sum*20));
		
		
		
}
}
