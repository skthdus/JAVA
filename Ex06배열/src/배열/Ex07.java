package 배열;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String[] id_arr = new String[3];
		String[] pw_arr = new String[3];

		int cnt = 0; //현재 몇 명이 가입했는지 저장할 변수

		while (true) {
			System.out.println("1.회원가입 2.로그인 3.종료");
			int menu = sc.nextInt();

			if (menu == 1) { //회원가입
				if(cnt<3) {
					
				System.out.println("===회원가입===");

				System.out.print("id 입력 : ");
				id_arr[cnt] = sc.next();

				System.out.print("pw 입력 : ");
				pw_arr[cnt] = sc.next();
				cnt++;
				
				System.out.println("가입 성공");

				}else {
					System.out.println("더이상 가입할 수 없습니다");

				}
				}else if (menu == 2) { //로그인
					System.out.println("===로그인===");

					System.out.print("id 입력 : ");
					String id = sc.next();

					System.out.print("pw 입력 : ");
					String pw = sc.next();
					
					boolean sw = false; //로그인을 성공/실패 저장할 변수
				for (int i = 0; i<cnt; i++) {
					if (id_arr[i].equals(id) && pw_arr[i].equals(pw)) {
						System.out.println("로그인 성공!");
						sw = true;
						break;
					} 
					}
					if(sw==false) {
					System.out.println("로그인 실패..");
					
					}
					
					} else { //3
					System.out.println("프로그램을 종료합니다.");
					break;
				}

			}

		}

	}

