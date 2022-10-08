package while문;

import java.util.Scanner;

public class Ex05로그인 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0; //틀린 개수 저장할 변수
		
		do {
			System.out.print("아이디 : ");
			String id = sc.next();
			
			System.out.print("비밀번호 : ");
			String pw = sc.next();
			
			if(id.equals("smhrd") && pw.equals("1234")) {
				System.out.println("로그인 성공!");
				break;
				
			} else {
				System.out.println("로그인 실패");
				
				// 틀린 개수 세기
				cnt++; //cnt = cnt +1 > 1증가
				if (cnt==3) {
					System.out.println("본인인증을 해주세요");
					break;
				}
				
				System.out.print("계속 하시겠습니까?");
				String answer = sc.next();
				if(answer.equals("N") || answer.equals("n")) { 
					// 그대로 진행 > 위로 올라가서 반복문 실행
					break;
				}
				
			}
			
		}while(true);
		
		

	}

}
