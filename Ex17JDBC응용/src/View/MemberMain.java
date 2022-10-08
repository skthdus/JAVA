package View;

import java.util.ArrayList;
import java.util.Scanner;

import Controller.MemberCon;
import Model.MemberDTO;

public class MemberMain {

	public static void main(String[] args) {
		
		// 사용자에게 보여지는 화면들을 작성하는 구역!
		
		Scanner sc = new Scanner(System.in);
		
		// Controller에게 접근을 위한 객체 생성!
		 MemberCon con = new MemberCon();
		 
		 int result = 0;
		
		while(true) {
			System.out.print("[1]회원가입 [2]로그인 [3]조회 [4]탈퇴 [5]종료 >> ");
			int menu = sc.nextInt();
			
			if(menu == 1) {
				// insert 작업
				System.out.println("====회원가입 기능!====");
				
				System.out.print("id : ");
				String id = sc.next();
				
				System.out.print("비밀번호 : ");
				String pw = sc.next();
				
				System.out.print("닉네임 : ");
				String nick = sc.next();
				
				System.out.print("나이 : ");
				int age = sc.nextInt();
				
				result = con.conInsert(id, pw, nick, age);
				
				if(result > 0) {
					System.out.println("가입 성공");
				} else {
					System.out.println("가입 실패");
				}
				
				// MemberDTO -> id, pw, nick, age -> (DB) 회원가입
				
				
			} else if (menu == 2) {
				// select 작업
				
				System.out.print("로그인 할 아이디 : ");
				String id = sc.next();
				
				System.out.print("로그인 할 비밀번호 : ");
				String pw = sc.next();
				
				// 로그인 성공시 회원의 닉네임 출력하기!
				String nick = con.conLogin(id, pw);
				
				if(nick != null) {
					System.out.println("환영합니다 ~~ " + nick + " 님");
				} else {
					System.out.println("로그인 실패");
				}
				
			} else if (menu == 3) {
				// select 작업
				
				ArrayList<MemberDTO> resultList = new ArrayList<>();
				
				resultList = con.conSelect(); // Controller에 기능 요청!
				
				// ArrayList 출력!
				for(int i =0; i < resultList.size(); i++) {
					System.out.println(resultList.get(i).getId() + " / "
							+ resultList.get(i).getNick());
				}
				
			} else if (menu == 4) {
				// delete 작업
			} else if (menu == 5) {
				break;
			}
		}

	}

}
