package 반복문;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		System.out.println("=== 채점하기 ===");
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String OX = null;
		int score = 0;
		
		for(int i=0; i<N; i++) {
			int count = 0;
			score = 0;
			OX = sc.next();
			for(int j=0; j<OX.length(); j++) {
				if(OX.charAt(j)=='O') {
					count++;
					score = score + count;
				} else if (OX.charAt(j)=='X') {
					count = 0;
				}
			}
			System.out.println(score);
		}

	}

}
