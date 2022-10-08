package 연산자;

public class Ex07비트시프트연산자 {

	public static void main(String[] args) {
		// 비트연산 : AND(&), OR(|) , XOR(^), NOT(~)  2진법
		System.out.println(3&5); // 둘 다 1일 때만 1
		System.out.println(3|5); // 둘 다 0일 때만 0
		System.out.println(3^5); // 같으면 0 다르면 1
		System.out.println(~3); // 0->1 1->0 맨 앞자리가 1일 경우에는 음수, 그 이후로 숫자계산
		
		
		// 시프트연산 (<<.>>)
		int a = 3;
		int b =a<<2;
		System.out.println(b);
		
	

	}

}
