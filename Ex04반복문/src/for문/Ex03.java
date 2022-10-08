package for문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//num1과 num2 중에 어떤 수가 더 작은지 판단!
			if(num1<num2) { //num1~num2
			for(int i =num1 ; i<=num2;i++) {
				System.out.println(i);
			}
			} else { //num2가 더 작다 -> num2~num1
				for(int i =num2 ; i<=num1;i++) {
					System.out.println(i);
				}
			}
			
			//삼항연산자 활용
			
			int num3 = sc.nextInt();
			int num4 = sc.nextInt();
			
			//삼항연산자 사용 num3/num4 중 더 큰 숫자 big, 더 작은 숫자 small
			
			int big = (num3<num4)? num4 : num3;
			int small = (num3<num4)? num3 : num4 ;
			
			for(int i = small; i<=big; i++) {
				System.out.println(i);
			}
	}
}
			
			
		
		

	


