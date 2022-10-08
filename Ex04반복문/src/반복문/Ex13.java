package 반복문;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("==== 알파벳 빈도수 구하기 ====");
		System.out.print("입력 >> ");
		
		String alphabet = sc.next();
		int input = 0;
		
		for(int i=0; i<alphabet.length(); i++) { 
			String s = alphabet.substring(alphabet.length()-i,alphabet.length()-i+1);
			
			int n = Integer.parseInt(s); 
			
		
			}
			

	}

}

