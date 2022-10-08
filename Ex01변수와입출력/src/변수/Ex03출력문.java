package 변수;

public class Ex03출력문 {

	public static void main(String[] args) {
		// 출력문
		//\n : 개행
		System.out.print("출력하고 싶은 구문\n");
		//출력문 자동완성 : syso + ctrl + space
		//System.out.println(); 
		System.out.println("출력구문2번");
		System.out.println("출력구문3번");
		
		// 1. 오늘 점심값 : 20000원
		System.out.println(1+". 오늘 점심값 : "+20000+"원");
		
		System.out.printf("%d. 오늘 점심값 : %d%s\n",1,20000,"원");
		System.out.println("끝");

	}

}
