import java.util.Scanner;

public class 치환 {

	public static void main(String[] args) {
		
		// new -> 도구 생성
		// 생성 -> 운영체제(OS) 자원을 가져다가 씀
		Scanner sc= new Scanner(System.in);
		
		
		int num1 = sc.nextInt();		
		int num2 = sc.nextInt();
		
		sc.close(); // OS 자원을 반환
		
		sc.nextInt();
		
		
		
		System.out.println(num1); //10
		System.out.println(num2); //20
		
		//값 치환
		int temp = num1; //num1 = 10, num2 = 20; temp = 10
		num1 = num2; // num1 = 20, num2 = 20, temp = 10
		num2 = temp; // num1 = 20, num2 = 10, temp = 10
		
		System.out.println(num1); //20
		System.out.println(num2); //10
	}

}
