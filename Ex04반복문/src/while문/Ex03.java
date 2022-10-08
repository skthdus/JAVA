package while문;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0; //사용자가 입력한 값
		int odd = 0; //홀수 개수
		int even = 0; //짝수 개수
		
		
		do {
			System.out.print("숫자 입력 : ");
			num = sc.nextInt();
			
			if (num%2==1) { //홀수
				odd = odd + 1; // odd++
			} else if(num%2==0) { //짝수
				even = even + 1; // even++
			}
		} while(num!=-1);
		
			
		System.out.println("홀수 개수 : " + odd);
		System.out.println("짝수 개수 : " + even);
		
				
		}
	
	}


