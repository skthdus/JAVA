package while문;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		String id = "smhrd";
		String password = "1234";
		
		int wrong = 0;
		
		
		while(true) { 
			
		System.out.print("아이디 : ");
		String input_id = sc.next();
		
		System.out.print("비밀번호 : ");
		String input_pass = sc.next();
		
		
	
		 if(!input_id.equals(id) || !input_pass.equals(password)) {
			System.out.println("로그인 실패"); 
			wrong++;
			
			if (wrong==3) {
				System.out.println("본인인증을 해주세요");
				break;
				
			}
			System.out.print("계속 하시겠습니까?");
			String a = sc.next();
			
			if(a.equals("N")) {
				break;
			} else if (a.equals("Y")) {
				
			}
			
		 } else if(input_id.equals(id) && input_pass.equals(password)) {
				System.out.println("로그인 성공!");
				break;
		
		
	
		
		} 
		}
	}
}
		
		
		
		 
		



