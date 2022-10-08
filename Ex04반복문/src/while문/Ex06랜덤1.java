package while문;

import java.util.Random;
import java.util.Scanner;

public class Ex06랜덤1 {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
		    //랜덤 도구 생성
			Random rd = new Random();
			
			boolean sw = true; //사용자가 정답을 맞췄을 때 -> true (새로운 문제)
							   //사용자가 오답을 작성했을 때 -> false (이전 문제)
			
			int num1 = 0; //첫번째 랜던값 저장 변수
			int num2 = 0; //두번째 랜덤값 저장 변수
			
			int o = 0; //맞춘개수 저장 변수
			int x = 0; //틀린개수 저장 변수
			
			while(true) {
				//1~10까지 중 랜덤 수 뽑기
				//첫번째 랜덤 수 뽑기
				//(10) -> 0~9
				
				if(sw==true) {
					num1= rd.nextInt(10)+1;
					num2 = rd.nextInt(10)+1;
				}
				
				System.out.printf("%d + %d = ", num1, num2);
				
				int input = sc.nextInt(); //사용자가 입력한 답
				
				if(input==num1+num2) { //정답을 입력한 경우
					System.out.println("Success!");
					sw = true;
					o++;
				} else{ // 오답을 입력한 경우
					System.out.println("Fail!");
					sw = false;
					x++;
				}
				
				System.out.print("계속하시겠습니까?");
				String answer = sc.next();
				
				if(answer.equals("N") || answer.equals("n")) {
					System.out.println("프로그램 종료!");
					break;
				}else if(answer.equals("Y") || answer.equals("y")) {
					continue; //현재 줄 아래에 있는 실행문장은 무시, 조건 확인 부분으로 이동
				}
				
			}
			
			System.out.println("맞춘개수 : " + o);
			System.out.println("틀린개수 : " + x);
		

	}

}
