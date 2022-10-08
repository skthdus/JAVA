package 연산자;

public class Ex01산술연산 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 7;
		float num3 = 10f; //10.0
		float num4 = 7f; //7.0
		
		System.out.println(num1/num2); //정수, 정수 -> 1
		System.out.println(num3/num4); //실수, 실수 -> 1.4285715 (실수)
		System.out.println(num3/num2); //실수, 정수 -> 1.4285715 (정수)

		// 문자+숫자 = 문자
		
		
		
		int num5 = 7;
		int num6 = 3;
		double num7 = (double) num5 ;
		
		System.out.println(num5+num6);
		System.out.println(num5-num6);
		System.out.println(num5*num6);
		System.out.println(num7/num6);
		
		
		//합
		int sum = num5+num6;
		//차
		int minus = num5-num6;
		//곱
		int mul = num5*num6;
		//나누기
		double div = (double)num5/num6;
		
		System.out.println("더하기 결과 : " + sum);
		System.out.println("빼기 결과 : " + minus);
		System.out.println("곱하기 결과 : " + mul);
		System.out.println("나누기 결과 : " + div);
		
		System.out.printf("나누기 결과 : %.2f",div);

		
	}

}
