package 반복문;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		String str = sc.next();
		
		
		/* 문자를 잘라줌
		 * charAt() > char 형태로 결과값 
		 * subString() > String 형태로 결과값
		 */
		
		int sum = 0; //누적합
		//length() : 문자열 길이 구하는 기능
		for(int i=1; i<=str.length(); i++) { 
			//자른 숫자를 문자열로 저장
			String s = str.substring(str.length()-i,str.length()-i+1);
			//문자열 -> 정수
			//Integer : int의 클래스타입(레퍼런스 타입)
			int n = Integer.parseInt(s); 
			
			if(n==1) {
				for(int j=1; j<i ;j++) {
					n*=2;
					
				}
			}
			sum += n;
		}
		System.out.println(str + "(2) = " + sum + "(10)");
	
		
		

	}

}
