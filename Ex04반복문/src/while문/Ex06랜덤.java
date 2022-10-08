package while문;

import java.util.Random;
import java.util.Scanner;

public class Ex06랜덤 {

	public static void main(String[] args) {
		
		//랜덤 도구 생성
		Random rd = new Random();
		
		//1~10까지 중 랜덤 수 뽑기
		//첫번째 랜덤 수 뽑기
		//(10) -> 0~9
		
		int num1= rd.nextInt(10)+1;
		int num2 = rd.nextInt(10)+1;
		
		
		int suc = 0;
		int fal =0;
		
		while(true){
			
			
			System.out.print(num1 + " + ");
			System.out.print(num2 + " = ");
			
			Scanner sc = new Scanner(System.in);
			int sum = sc.nextInt();
			
			
			if((num1+num2)==sum) {
				System.out.println("Success!");
				suc++;
			} else {
				System.out.println("Fail!");
				fal++;
			
			}
			
				System.out.print("계속하시겠습니까?");
				String next = sc.next();
			
			
			if(next.equals("Y") && ((num1+num2)==sum)) {
				num1= rd.nextInt(10)+1;
				num2 = rd.nextInt(10)+1;
			}  
			if(next.equals("N")) { 
				System.out.println("종료!");
				break;		
				}
			
			} 
		System.out.println("맞춘개수 : " + suc);
		System.out.println("틀린개수 : " + fal);
					
			} 
		
		
	}


