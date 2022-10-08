package 배열;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		//문자열 배열 생성, 래퍼런스 변수 선언
		String[] arrStr = new String[5];

		arrStr[0] = "박진형";
		arrStr[1] = "김설아";
		arrStr[2] = "임다인";
		arrStr[3] = "문재승";
		arrStr[4] = "김지연";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("검색할 이름 입력 >> ");
		String name = sc.next();
		
		String[] arrStr1 = {"김지은", "박수현", "정세연", "이명훈", "강예진", "임명진", "정형", "채수민"};
		
		for(int i=0; i<arrStr1.length; i++) {
			if(name.equals(arrStr1[i])) {
				System.out.println(name + "님은 " + i +"번째 인덱스에 저장되어 있습니다");
				break; //더이상 반복을 진행하지 않아도 될때 활용 하기!
			}
			
		}
		
		//확장for문 (for~each문) -> 배열, arraylist
		//(배열의 0번 인텍스부터 실제값을 임시적으로 저장할 변수 선언 : 배열 레퍼런스 변수 이름)
		for(String s: arrStr) {
			System.out.println(s);
		}
		
	}

}
