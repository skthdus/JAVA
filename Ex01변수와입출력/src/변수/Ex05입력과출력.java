package 변수;

import java.util.Scanner;

public class Ex05입력과출력 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.next();
		
		
		System.out.print("나이 : ");
		int age = scan.nextInt();
		
		
		System.out.println("이름은 "+ name + "이고 나이는 " + age + "입니다");
		System.out.printf("이름은 %s이고 나이는 %d입니다", name, age);

		
		
	}

}
