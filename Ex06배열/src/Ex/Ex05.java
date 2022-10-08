package Ex;

import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";
		
		//String -> split()
		String[] scoreArr = score.split(","); // ,를 기준으로 문자를 나누겠다
		
		//1. 각 알파벳의 개수를 카운팅할 변수 따로
		int a =0, b=0, c=0, d=0, f=0;
		//2. 각 개수를 저장할 배열 생성[5]
		int[] cntArr = new int[5];
		//정수형 배열은 따로 값을 설정하지 않으면 기본값 0
		//0-A 1-B 2-C 3-D 4-F
		
		for(String s:scoreArr) {
			if(s.equals("A")) {
				a++;
				cntArr[0]++;
			} else if(s.equals("B")) {
				b++;
				cntArr[1]++;
			} else if(s.equals("C")) {
				c++;
				cntArr[2]++;
			} else if(s.equals("D")) {
				d++;
				cntArr[3]++;
			} else { //F
				f++;
				cntArr[4]++;
			}
		}

		System.out.println("A : "+ a + "명");
		System.out.println("B : "+ b + "명");
		System.out.println("C : "+ c + "명");
		System.out.println("D : "+ d + "명");
		System.out.println("F : "+ f + "명");

		System.out.println(Arrays.toString(cntArr));
	}

}
